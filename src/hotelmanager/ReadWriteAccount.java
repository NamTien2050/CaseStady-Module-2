package hotelmanager;

import java.io.*;

public class ReadWriteAccount {
    public void account() {
        AccountManagement.list = null;
    }

    public static void writeAccount() {
        Account createAccount = new Account();
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\Module 2\\CaseStady\\src\\hotelmanager\\Account.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Account customer : AccountManagement.list) {
                bufferedWriter.write(createAccount.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAccount() {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\Module 2\\CaseStady\\src\\hotelmanager\\Account.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                AccountManagement.list.add(new Account(str[0], str[1], str[2], Integer.parseInt(str[3].trim()), str[4], str[5], str[6]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
