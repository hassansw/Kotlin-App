package spirals.kotlin_app.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserData {

    @SerializedName("pat_userId")
    @Expose
    var patUserId: String? = null
    @SerializedName("userAcc_id")
    @Expose
    var userAccId: String? = null
    @SerializedName("pat_name")
    @Expose
    var patName: String? = null
    @SerializedName("pat_lat")
    @Expose
    var patLat: String? = null
    @SerializedName("pat_long")
    @Expose
    var patLong: String? = null
    @SerializedName("status")
    @Expose
    var status: String? = null

}