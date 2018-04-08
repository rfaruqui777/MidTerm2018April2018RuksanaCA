public class DatabaseLicense {
    private static DatabaseLicense instance = new DatabaseLicense();
    private DatabaseLicense() {
    }
    public static DatabaseLicense getInstance(){
        return instance;
        }
        public void databaseConnection(){
        System.out.println("You are authorized for an connection");
        }
}
