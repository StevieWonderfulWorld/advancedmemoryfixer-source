package core.anticheat.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SLAPI {
  public static Object load(byte llllIlIlIIIlllI) throws Exception {
    ObjectInputStream llllIlIlIIlIIII = new ObjectInputStream(new FileInputStream(llllIlIlIIIlllI));
    Object llllIlIlIIIllll = llllIlIlIIlIIII.readObject();
    llllIlIlIIlIIII.close();
    return llllIlIlIIIllll;
  }
  
  public static void save(char llllIlIlIIlIlll, String llllIlIlIIllIIl) throws Exception {
    ObjectOutputStream llllIlIlIIllIII = new ObjectOutputStream(new FileOutputStream(llllIlIlIIllIIl));
    llllIlIlIIllIII.writeObject(llllIlIlIIlIlll);
    llllIlIlIIllIII.flush();
    llllIlIlIIllIII.close();
  }
  
  static {
  
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\antichea\\util\SLAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */