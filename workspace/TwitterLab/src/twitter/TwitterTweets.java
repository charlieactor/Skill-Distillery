package twitter;

import java.io.*;

public class TwitterTweets {
    public static void main(String[] args) throws IOException {

        try (BufferedReader buffIn = new BufferedReader(new FileReader("Tweetingtest.txt"))) {
            String line;
            String total = "";
            while ((line = buffIn.readLine()) != null) {
                total += line;
            }
            String[] tweets = total.split("\\b[\\w|\\s|.*!@#$%^&()_~`+=?><,\"':;\\{}\\[\\]\\\\|-]{1,140}\\b");
            for (int i = 0; i < tweets.length; i++) {
                System.out.println(tweets[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}