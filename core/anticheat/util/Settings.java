package core.anticheat.util;

import core.anticheat.Core;
import core.anticheat.api.onEnable;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;

public class Settings {
  private static String lllIll(String lllllIlIIIllllI, double lllllIlIIIllIll) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: ldc 'Blowfish'
    //   21: invokespecial <init> : ([BLjava/lang/String;)V
    //   24: astore_2
    //   25: ldc 'Blowfish'
    //   27: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   30: astore_3
    //   31: aload_3
    //   32: getstatic core/anticheat/util/Settings.lIIlll : [I
    //   35: iconst_3
    //   36: iaload
    //   37: aload_2
    //   38: invokevirtual init : (ILjava/security/Key;)V
    //   41: new java/lang/String
    //   44: dup
    //   45: aload_3
    //   46: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   49: aload_0
    //   50: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   53: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   56: invokevirtual decode : ([B)[B
    //   59: invokevirtual doFinal : ([B)[B
    //   62: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   65: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   68: areturn
    //   69: astore_2
    //   70: aload_2
    //   71: invokevirtual printStackTrace : ()V
    //   74: aconst_null
    //   75: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	76	0	lllllIlIIIlllII	F
    //   0	76	2	lllllIlIIIllIlI	D
    //   0	76	0	lllllIlIIIllllI	Ljava/lang/String;
    //   0	76	3	lllllIlIIIllIIl	C
    //   31	38	3	lllllIlIIlIIIII	Ljavax/crypto/Cipher;
    //   0	76	1	lllllIlIIIlllIl	Ljava/lang/String;
    //   70	4	2	lllllIlIIIlllll	Ljava/lang/Exception;
    //   25	44	2	lllllIlIIlIIIIl	Ljavax/crypto/spec/SecretKeySpec;
    //   0	76	1	lllllIlIIIllIll	D
    // Exception table:
    //   from	to	target	type
    //   0	68	69	java/lang/Exception
  }
  
  private static boolean lIlIIlI(String lllllIlIIIlIlll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static void lIlIIII() {
    lIIlll = new int[4];
    lIIlll[0] = 95 + 163 - 240 + 182;
    lIIlll[1] = (0x6E ^ 0x30 ^ 17 + 97 - 57 + 70) & (0x19 ^ 0x59 ^ 0xD8 ^ 0xB9 ^ -" ".length());
    lIIlll[2] = " ".length();
    lIIlll[3] = "  ".length();
  }
  
  private static void lIIlllI() {
    lIIIll = new String[lIIlll[3]];
    lIIIll[lIIlll[1]] = lllIll("qN6bcqkBLHE=", "FjOBy");
    lIIIll[lIIlll[2]] = lllIll("ldHYOffd95I=", "XXuYe");
  }
  
  static {
    NAME = plugin.getDescription().getName();
    PREFIX = onEnable.config.getString(lIIIll[lIIlll[1]]);
    blocked = new ArrayList<>();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    if (lIlIIlI(Bukkit.getVersion().contains(lIIIll[lIIlll[2]])))
      "".length(); 
  }
  
  static {
    lIlIIII();
    lIIlllI();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\antichea\\util\Settings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */