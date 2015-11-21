package pigpio4s;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pi_i2c_msg_t extends Structure {
	/** slave address */
	public short addr;
	public short flags;
	/** msg length */
	public short len;
	/** pointer to msg data */
	public Pointer buf;
	public pi_i2c_msg_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("addr", "flags", "len", "buf");
	}
	public pi_i2c_msg_t(short addr, short flags, short len, Pointer buf) {
		super();
		this.addr = addr;
		this.flags = flags;
		this.len = len;
		this.buf = buf;
	}
	public pi_i2c_msg_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pi_i2c_msg_t implements Structure.ByReference {
		
	};
	public static class ByValue extends pi_i2c_msg_t implements Structure.ByValue {
		
	};
}
