import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class XXYY {
    public static void main(String[] args) {
        String sfcn="";
//        String fzrq = "2021-04-01";
        String fzrq = "2071-10-19";
        String csrq = "2003-10-18";
        int res=0;
        int resMonth = 0;
        int resDay = 0;
        try {
            if(!"".equals(fzrq)&&!"".equals(csrq)){
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                //res = CommonTools.getDateDiff(df.parse(fzrq),df.parse(csrq));
                Calendar cal = Calendar.getInstance();
                cal.setTime(df.parse(fzrq));
                int yearStart = cal.get(Calendar.YEAR);
                int monthStart = cal.get(Calendar.MONTH);
                int dayStart = cal.get(Calendar.DAY_OF_MONTH);
                Calendar cal2 = Calendar.getInstance();
                cal2.setTime(df.parse(csrq));
                int yearEnd = cal2.get(Calendar.YEAR);
                int monthEnd = cal2.get(Calendar.MONTH);
                int dayEnd = cal2.get(Calendar.DAY_OF_MONTH);
                res=yearStart-yearEnd;
                resMonth=monthStart-monthEnd;
                resDay=dayStart-dayEnd;
            }
            /*if(res!=0){
                if(res>=18){
                    sfcn="0";
                }else{
                    sfcn="1";
                }
            }*/
            if(res >= 18){
                sfcn="0";
                if(res == 18){
                    if(resMonth>=0 && resDay>=0){
                        sfcn="0";
                    }else{
                        sfcn="1";
                    }
                }
            }else{
                sfcn="1";
            }
            System.out.println(sfcn);

            String uuid = UUID();
            System.out.println(uuid);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

     public static String UUID(){
        UUID uid = UUID.randomUUID();
        String str = uid.toString();
        return str.toString().replace("-","");
    }
}
