package spirals.kotlin_app.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.gson.Gson
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import spirals.kotlin_app.Interfaces.ApiInterface
import spirals.kotlin_app.Models.UserData

import spirals.kotlin_app.R
import spirals.kotlin_app.REST_API.ApiClient
import java.io.IOException


class FragmentHome : Fragment() {

    var tvHomeLabel:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvHomeLabel = view!!.findViewById<TextView>(R.id.tvHomeLabel) as TextView

        val apiService = ApiClient.getClient.create(ApiInterface::class.java)
        val call = apiService.getJobOrderList()
        call.enqueue(object : Callback<UserData> {
            override fun onResponse(call: Call<UserData>, response: Response<UserData>) {
                println("Response: " + response.body()?.patName)
                tvHomeLabel!!.setText(response.raw().toString())
            }

            override fun onFailure(call: Call<UserData>, t: Throwable) {
                System.out.printf("Failed")
            }
        })
    }

}
