package spirals.kotlin_app.Models

class JobOrderListParams {

    var retailerId: Int = 0

    var retailerBranchId: Int = 0         //Pass Retailer Branch ID when you need filteration on Customer Job Order Status & Job Order List.

    var customerId: Int = 0               //Pass CustomerID when Job Order List Type is "JobOrder"

    var technicianId: Long = 0             //Pass Technician ID when Technician filter required on Customer Job Order Status & Job Order List.

    var jobOrderId: Int = 0               //Pass JobOrderID (tblJobOrder.TranID) when single job order data required on Job Order List.

    var jobOrderSizeId: Int = 0           //Pass JobOrderSizeId (tblJobOrder.TranDtlID) when single detail row for job order size data required on Job Order Detail Screen.

    var fromId: String? = null                  //Pass CustomerID when Job Order List Type is "Customer" else JobOrderID (tblJobOrder.TranID).

    var recordCount: Int = 0

    var month: Int = 0

    var year: Int = 0

    var jobOrderListType: String? = null        // Customer/JobOrder

    var searchText: String? = null             // Searching Text required on Customer Job Order Status & Job Order List.

    var day: Int = 0
    var toMonth: Int = 0
    var toYear: Int = 0
    var toDay: Int = 0
}
