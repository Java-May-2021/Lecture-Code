public class OnlineOrder extends Order {
  private int warehouseId;

  public OnlineOrder(int id, int total, String name) {
    super(id, total, name);
    this.warehouseId = 33;
  }

  public void cancel() {
    System.out.println("order has been canceled from " + this.warehouseId);
  }

  public int getWarehouseId() {
    return this.warehouseId;
  }

  public void setWarehouseId(int id) {
    this.warehouseId = id;
  }
}