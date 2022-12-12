/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dantr
 */
public class BillDetail {

    String IDBillDetail, IDorder,  DateOrder, TimeOrder, Username;
    double SubTotal,DiscountPromom,Total ,pay, readyCash, payMent;

    public BillDetail() {
    }

    public BillDetail(String IDBillDetail, String IDorder, String DateOrder, String TimeOrder, String Username, double SubTotal, double DiscountPromom, double Total, double pay, double readyCash, double payMent) {
        this.IDBillDetail = IDBillDetail;
        this.IDorder = IDorder;
        this.DateOrder = DateOrder;
        this.TimeOrder = TimeOrder;
        this.Username = Username;
        this.SubTotal = SubTotal;
        this.DiscountPromom = DiscountPromom;
        this.Total = Total;
        this.pay = pay;
        this.readyCash = readyCash;
        this.payMent = payMent;
    }

    public String getIDBillDetail() {
        return IDBillDetail;
    }

    public void setIDBillDetail(String IDBillDetail) {
        this.IDBillDetail = IDBillDetail;
    }

    public String getIDorder() {
        return IDorder;
    }

    public void setIDorder(String IDorder) {
        this.IDorder = IDorder;
    }

    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String DateOrder) {
        this.DateOrder = DateOrder;
    }

    public String getTimeOrder() {
        return TimeOrder;
    }

    public void setTimeOrder(String TimeOrder) {
        this.TimeOrder = TimeOrder;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public double getDiscountPromom() {
        return DiscountPromom;
    }

    public void setDiscountPromom(double DiscountPromom) {
        this.DiscountPromom = DiscountPromom;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getReadyCash() {
        return readyCash;
    }

    public void setReadyCash(double readyCash) {
        this.readyCash = readyCash;
    }

    public double getPayMent() {
        return payMent;
    }

    public void setPayMent(double payMent) {
        this.payMent = payMent;
    }

         
}// end class
