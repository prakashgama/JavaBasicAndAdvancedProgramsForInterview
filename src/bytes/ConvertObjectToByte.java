package bytes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Objects;

public class ConvertObjectToByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByteClass b = new ByteClass();

		b.setAge(12);
		b.setName("prakash");

		try {
			byte[] obj = getByteArrayFromObject(b);
			ByteClass t = (ByteClass) getObjectFromByteArray(obj);
			System.out.println(t.equals(b));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static byte[] getByteArrayFromObject(Object obj) throws IOException {
		if (Objects.nonNull(obj)) {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			try (ObjectOutputStream os = new ObjectOutputStream(bos)) {
				os.writeObject(obj);
			}
			return bos.toByteArray();
		}
		return null;
	}

	private static Object getObjectFromByteArray(byte[] byteArr) throws IOException, ClassNotFoundException {
		if (Objects.nonNull(byteArr)) {
			ByteArrayInputStream bis = new ByteArrayInputStream(byteArr);
			ObjectInput in = new ObjectInputStream(bis);
			return in.readObject();
		}
		return null;
	}

}
