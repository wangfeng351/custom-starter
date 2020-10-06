/**
 * @Description TODO
 * @Author wf
 * @Date 2020/10/6
 * @Version 1.0
 */
public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}
