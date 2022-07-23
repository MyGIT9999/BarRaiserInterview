import java.util.*;
import java.text.SimpleDateFormat;
class User {
    public void urlShortner (HashMap user)
    {
        int users = user.size();
        Calendar currentTime = Calendar.getInstance();
        SimpleDateFormat currentDate = new SimpleDateFormat("dd-MM-yyyy");
        HashMap shorterUrls = new HashMap();
        for (int i=1; i<=users; i++){
            String data = user.get(i).toString();
            String[] urls = data.split(",");
            String singleUrl = urls[1];
            String queryStringForUrl = currentDate.format(new Date())+""+currentTime.getTime();
            String[] shortUrl = singleUrl.split("?");
            shorterUrls.put(i,shortUrl[3]+"/"+queryStringForUrl);
        } 
        for (int i=1; i<=users; i++){
            System.out.println(shorterUrls.get(i).toString());
        }   

    }
}

class Main {

    public static void main(String[] args) {
        HashMap user = new HashMap();
        User sendData = new User();
        user.put(1,"Jay,https://www.bing.com/search?q=put%20array%20into%20hashmap%20as%20a%20value%20geeksforgeeksa&qs=n&form=QBRE&=%25eManage%20Your%20Search%20History%25E&sp=-1&pq=put%20array%20into%20hashmap%20as%20a%20value%20geeksforgeeksa&sc=0-48&sk=&cvid=58BDBDF982CA46E6BC7BFE539CA9A746&ghsh=0&ghacc=0&ghpl= ");
        user.put(2,"Jack,https://www.bing.com/abc?2022%ahsbdchdc");
        user.put(3,"Jenni,https://www.xyz.com/klllg?2022%12yujbasdf");
        sendData.urlShortner(user);
       
    }
}