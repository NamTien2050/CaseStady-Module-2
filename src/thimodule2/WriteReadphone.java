package thimodule2;


import java.io.*;

public class WriteReadphone {
    public void phone() {
        TelephoneManager.listPhone = null;
    }

    public static void writePhoneList() {
        TelephoneDirectory createAPhoneList = new TelephoneDirectory();
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\Module 2\\CaseStady\\TelephoneList.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (TelephoneDirectory phone : TelephoneManager.listPhone) {
                bufferedWriter.write(createAPhoneList.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPhoneList() {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\Module 2\\CaseStady\\TelephoneList.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                TelephoneManager.listPhone.add(new TelephoneDirectory(str[0], str[1], str[2],str[3], str[4], str[5], str[6]));
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
