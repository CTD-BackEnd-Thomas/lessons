public class Client {

    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public Client(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void dowloadRequest (String songName){

        DownloadProxy download = new DownloadProxy();

        download.downloadMusic(this);

    }

    public static void main(String[] args) {

         Client client1 = new Client(1,"Free");
         Client client2 = new Client(2,"Premium");


         client1.dowloadRequest("O que você foi fazer no mato Maria Chiquinha");
         client2.dowloadRequest("Maria Maria");

    }

}
