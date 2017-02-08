package ln.retrofitpost.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by comp-1 on 3/2/17.
 */

public class DataResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }


    public class Datum {

        @SerializedName("smart_lot")
        @Expose
        private Integer smartLot;
        @SerializedName("parking_has_shuttle")
        @Expose
        private Integer parkingHasShuttle;
        @SerializedName("TxnID")
        @Expose
        private String txnID;
        @SerializedName("UsrID")
        @Expose
        private String usrID;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("Cat_ID")
        @Expose
        private String catID;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("Activity_ID")
        @Expose
        private String activityID;
        @SerializedName("Care_ID")
        @Expose
        private String careID;
        @SerializedName("Dine_ID")
        @Expose
        private String dineID;
        @SerializedName("Parking_ID")
        @Expose
        private String parkingID;
        @SerializedName("Ticket_ID")
        @Expose
        private String ticketID;
        @SerializedName("Movie_ID")
        @Expose
        private String movieID;
        @SerializedName("TxnDate")
        @Expose
        private String txnDate;
        @SerializedName("PaymentPlanID")
        @Expose
        private String paymentPlanID;
        @SerializedName("PaymentSource")
        @Expose
        private String paymentSource;
        @SerializedName("RefBy")
        @Expose
        private String refBy;
        @SerializedName("PaymentDesc")
        @Expose
        private String paymentDesc;
        @SerializedName("Instant_MovieTicket")
        @Expose
        private String instantMovieTicket;
        @SerializedName("Movie_Tickets")
        @Expose
        private String movieTickets;
        @SerializedName("quantity")
        @Expose
        private String quantity;
        @SerializedName("Amount")
        @Expose
        private String amount;
        @SerializedName("TotalAmount")
        @Expose
        private String totalAmount;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("from_date")
        @Expose
        private String fromDate;
        @SerializedName("to_date")
        @Expose
        private String toDate;
        @SerializedName("Ticket_Title")
        @Expose
        private String ticketTitle;
        @SerializedName("Ticket_EventID")
        @Expose
        private String ticketEventID;
        @SerializedName("Ticket_EventVenue")
        @Expose
        private String ticketEventVenue;
        @SerializedName("Ticket_Section")
        @Expose
        private String ticketSection;
        @SerializedName("Ticket_Row")
        @Expose
        private String ticketRow;
        @SerializedName("Ticket_Owner")
        @Expose
        private String ticketOwner;
        @SerializedName("Redeem")
        @Expose
        private String redeem;
        @SerializedName("Status")
        @Expose
        private String statusData;
        @SerializedName("regdate")
        @Expose
        private String regdate;
        @SerializedName("Discount")
        @Expose
        private String discount;
        @SerializedName("Item_ID")
        @Expose
        private String itemID;
        @SerializedName("firstname")
        @Expose
        private String firstname;
        @SerializedName("lastname")
        @Expose
        private String lastname;
        @SerializedName("email_add")
        @Expose
        private String emailAdd;
        @SerializedName("voucher")
        @Expose
        private String voucher;
        @SerializedName("customer_image")
        @Expose
        private String customerImage;
        @SerializedName("Ticket_Type")
        @Expose
        private String ticketType;
        @SerializedName("Ticket_Quantity")
        @Expose
        private String ticketQuantity;
        @SerializedName("Main")
        @Expose
        private String main;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("DeliveryMethod")
        @Expose
        private String deliveryMethod;
        @SerializedName("DeliveryLat")
        @Expose
        private String deliveryLat;
        @SerializedName("DeliveryLong")
        @Expose
        private String deliveryLong;
        @SerializedName("OrderStatus")
        @Expose
        private String orderStatus;
        @SerializedName("Voucher_File")
        @Expose
        private String voucherFile;
        @SerializedName("Payat_Lot")
        @Expose
        private String payatLot;
        @SerializedName("orderDate")
        @Expose
        private String orderDate;
        @SerializedName("orderTime")
        @Expose
        private String orderTime;
        @SerializedName("orderType")
        @Expose
        private String orderType;
        @SerializedName("driver_firstname")
        @Expose
        private String driverFirstname;
        @SerializedName("driver_lastname")
        @Expose
        private String driverLastname;
        @SerializedName("driver_mobile")
        @Expose
        private String driverMobile;
        @SerializedName("driver_id")
        @Expose
        private String driverId;
        @SerializedName("res_logo")
        @Expose
        private String resLogo;
        @SerializedName("res_lat")
        @Expose
        private String resLat;
        @SerializedName("res_long")
        @Expose
        private String resLong;
        @SerializedName("review_count")
        @Expose
        private String reviewCount;

        private int orderId;

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public Integer getSmartLot() {
            return smartLot;
        }

        public void setSmartLot(Integer smartLot) {
            this.smartLot = smartLot;
        }

        public Integer getParkingHasShuttle() {
            return parkingHasShuttle;
        }

        public void setParkingHasShuttle(Integer parkingHasShuttle) {
            this.parkingHasShuttle = parkingHasShuttle;
        }

        public String getTxnID() {
            return txnID;
        }

        public void setTxnID(String txnID) {
            this.txnID = txnID;
        }

        public String getUsrID() {
            return usrID;
        }

        public void setUsrID(String usrID) {
            this.usrID = usrID;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCatID() {
            return catID;
        }

        public void setCatID(String catID) {
            this.catID = catID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getActivityID() {
            return activityID;
        }

        public void setActivityID(String activityID) {
            this.activityID = activityID;
        }

        public String getCareID() {
            return careID;
        }

        public void setCareID(String careID) {
            this.careID = careID;
        }

        public String getDineID() {
            return dineID;
        }

        public void setDineID(String dineID) {
            this.dineID = dineID;
        }

        public String getParkingID() {
            return parkingID;
        }

        public void setParkingID(String parkingID) {
            this.parkingID = parkingID;
        }

        public String getTicketID() {
            return ticketID;
        }

        public void setTicketID(String ticketID) {
            this.ticketID = ticketID;
        }

        public String getMovieID() {
            return movieID;
        }

        public void setMovieID(String movieID) {
            this.movieID = movieID;
        }

        public String getTxnDate() {
            return txnDate;
        }

        public void setTxnDate(String txnDate) {
            this.txnDate = txnDate;
        }

        public String getPaymentPlanID() {
            return paymentPlanID;
        }

        public void setPaymentPlanID(String paymentPlanID) {
            this.paymentPlanID = paymentPlanID;
        }

        public String getPaymentSource() {
            return paymentSource;
        }

        public void setPaymentSource(String paymentSource) {
            this.paymentSource = paymentSource;
        }

        public String getRefBy() {
            return refBy;
        }

        public void setRefBy(String refBy) {
            this.refBy = refBy;
        }

        public String getPaymentDesc() {
            return paymentDesc;
        }

        public void setPaymentDesc(String paymentDesc) {
            this.paymentDesc = paymentDesc;
        }

        public String getInstantMovieTicket() {
            return instantMovieTicket;
        }

        public void setInstantMovieTicket(String instantMovieTicket) {
            this.instantMovieTicket = instantMovieTicket;
        }

        public String getMovieTickets() {
            return movieTickets;
        }

        public void setMovieTickets(String movieTickets) {
            this.movieTickets = movieTickets;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getFromDate() {
            return fromDate;
        }

        public void setFromDate(String fromDate) {
            this.fromDate = fromDate;
        }

        public String getToDate() {
            return toDate;
        }

        public void setToDate(String toDate) {
            this.toDate = toDate;
        }

        public String getTicketTitle() {
            return ticketTitle;
        }

        public void setTicketTitle(String ticketTitle) {
            this.ticketTitle = ticketTitle;
        }

        public String getTicketEventID() {
            return ticketEventID;
        }

        public void setTicketEventID(String ticketEventID) {
            this.ticketEventID = ticketEventID;
        }

        public String getTicketEventVenue() {
            return ticketEventVenue;
        }

        public void setTicketEventVenue(String ticketEventVenue) {
            this.ticketEventVenue = ticketEventVenue;
        }

        public String getTicketSection() {
            return ticketSection;
        }

        public void setTicketSection(String ticketSection) {
            this.ticketSection = ticketSection;
        }

        public String getTicketRow() {
            return ticketRow;
        }

        public void setTicketRow(String ticketRow) {
            this.ticketRow = ticketRow;
        }

        public String getTicketOwner() {
            return ticketOwner;
        }

        public void setTicketOwner(String ticketOwner) {
            this.ticketOwner = ticketOwner;
        }

        public String getRedeem() {
            return redeem;
        }

        public void setRedeem(String redeem) {
            this.redeem = redeem;
        }

        public String getStatusData() {
            return statusData;
        }

        public void setStatusData(String statusData) {
            this.statusData = statusData;
        }

        public String getRegdate() {
            return regdate;
        }

        public void setRegdate(String regdate) {
            this.regdate = regdate;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getItemID() {
            return itemID;
        }

        public void setItemID(String itemID) {
            this.itemID = itemID;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmailAdd() {
            return emailAdd;
        }

        public void setEmailAdd(String emailAdd) {
            this.emailAdd = emailAdd;
        }

        public String getVoucher() {
            return voucher;
        }

        public void setVoucher(String voucher) {
            this.voucher = voucher;
        }

        public String getCustomerImage() {
            return customerImage;
        }

        public void setCustomerImage(String customerImage) {
            this.customerImage = customerImage;
        }

        public String getTicketType() {
            return ticketType;
        }

        public void setTicketType(String ticketType) {
            this.ticketType = ticketType;
        }

        public String getTicketQuantity() {
            return ticketQuantity;
        }

        public void setTicketQuantity(String ticketQuantity) {
            this.ticketQuantity = ticketQuantity;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDeliveryMethod() {
            return deliveryMethod;
        }

        public void setDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
        }

        public String getDeliveryLat() {
            return deliveryLat;
        }

        public void setDeliveryLat(String deliveryLat) {
            this.deliveryLat = deliveryLat;
        }

        public String getDeliveryLong() {
            return deliveryLong;
        }

        public void setDeliveryLong(String deliveryLong) {
            this.deliveryLong = deliveryLong;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getVoucherFile() {
            return voucherFile;
        }

        public void setVoucherFile(String voucherFile) {
            this.voucherFile = voucherFile;
        }

        public String getPayatLot() {
            return payatLot;
        }

        public void setPayatLot(String payatLot) {
            this.payatLot = payatLot;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(String orderTime) {
            this.orderTime = orderTime;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getDriverFirstname() {
            return driverFirstname;
        }

        public void setDriverFirstname(String driverFirstname) {
            this.driverFirstname = driverFirstname;
        }

        public String getDriverLastname() {
            return driverLastname;
        }

        public void setDriverLastname(String driverLastname) {
            this.driverLastname = driverLastname;
        }

        public String getDriverMobile() {
            return driverMobile;
        }

        public void setDriverMobile(String driverMobile) {
            this.driverMobile = driverMobile;
        }

        public String getDriverId() {
            return driverId;
        }

        public void setDriverId(String driverId) {
            this.driverId = driverId;
        }

        public String getResLogo() {
            return resLogo;
        }

        public void setResLogo(String resLogo) {
            this.resLogo = resLogo;
        }

        public String getResLat() {
            return resLat;
        }

        public void setResLat(String resLat) {
            this.resLat = resLat;
        }

        public String getResLong() {
            return resLong;
        }

        public void setResLong(String resLong) {
            this.resLong = resLong;
        }

        public String getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(String reviewCount) {
            this.reviewCount = reviewCount;
        }

    }
}
