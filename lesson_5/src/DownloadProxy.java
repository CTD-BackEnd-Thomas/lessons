public class DownloadProxy implements Download {



    @Override
    public void downloadMusic(Client client) {

        if(client.getType().equals("Premium")){
            Download download = new DownloadService();
            download.downloadMusic(client);
        }
        else{
            System.out.println("Free users can't download musics.");
        }


    }
}
