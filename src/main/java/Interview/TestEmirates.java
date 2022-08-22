package Interview;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Question asked in Emirates Interview .
 */
public class TestEmirates {

   static HashMap hm=new HashMap();

    public static void main(String[] args) {
        String version=System.getProperty("java.version");
        TestEmirates.logPrint("IOException|This is IO Exception encountered so be careful in future");


    }

    public static void logPrint(String input){
        hm.put("IOException", new Except("IOException",100,"High"));
        String[] arr=input.split("\\|");
        System.out.println(Arrays.toString(arr));
        String firstArr=arr[0];
        System.out.println(firstArr);
        if(hm.containsKey(arr[0])){
            String message=arr[1];
            String typeE=arr[0];
            Except exe=(Except)hm.get(typeE);
            System.out.println(exe.getSeverity()+"|"+exe.getErrorCode()+"|"+exe.getExceptionType()+"|"+message);
        }


    }

}

class Except {


    private String exceptionType;
    private int errorCode;
    private String severity;

    public Except(String exceptionType, int errorCode, String severity){
        this.exceptionType=exceptionType;
        this.errorCode=errorCode;
        this.severity=severity;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
