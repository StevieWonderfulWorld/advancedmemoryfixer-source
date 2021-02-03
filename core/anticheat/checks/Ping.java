package core.anticheat.checks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Ping {
  private static void lIlIIlll() {
    lIIlIIl = new int[7];
    lIIlIIl[0] = " ".length();
    lIIlIIl[1] = (0xF8 ^ 0xBF) & (0x4 ^ 0x43 ^ 0xFFFFFFFF);
    lIIlIIl[2] = "  ".length();
    lIIlIIl[3] = "   ".length();
    lIIlIIl[4] = 0x99 ^ 0x9D;
    lIIlIIl[5] = 0x46 ^ 0x43;
    lIIlIIl[6] = 0x33 ^ 0x3 ^ 0x9B ^ 0xA3;
  }
  
  public Ping() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: getstatic core/anticheat/checks/Ping.lIIlIIl : [I
    //   8: iconst_0
    //   9: iaload
    //   10: putfield debug : Z
    //   13: return
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	14	0	llllIIlllIlllll	Lcore/anticheat/checks/Ping;
    //   0	14	0	llllIIlllIllllI	S
  }
  
  private Logger getLogger() {
    return null;
  }
  
  private static void lIIlllII() {
    lIIIIIl = new String[lIIlIIl[5]];
    lIIIIIl[lIIlIIl[1]] = lIIlIlll("+i51GKBM3Rs=", "MhkLs");
    lIIIIIl[lIIlIIl[0]] = lIIlIlll("gpj2VUhDltnsRBmiJrsGbsOzFcJKweff", "hyYlq");
    lIIIIIl[lIIlIIl[2]] = lIIllIII("S373VFBI+qDc9rkEZU+r8E7jB8IUQqXr", "nqASe");
    lIIIIIl[lIIlIIl[3]] = lIIlIlll("EvePKQtzbFBc5cCZ78qJBQ==", "QrDGX");
    lIIIIIl[lIIlIIl[4]] = lIIllIII("klagGQLWPoY=", "FiZgQ");
  }
  
  private static String lIIllIII(Exception llllIIllIIllllI, long llllIIllIIlllIl) {
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
    //   32: getstatic core/anticheat/checks/Ping.lIIlIIl : [I
    //   35: iconst_2
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
    //   25	44	2	llllIIllIlIIIll	Ljavax/crypto/spec/SecretKeySpec;
    //   0	76	1	llllIIllIIlllll	Ljava/lang/String;
    //   0	76	0	llllIIllIlIIIII	Ljava/lang/String;
    //   31	38	3	llllIIllIlIIIlI	Ljavax/crypto/Cipher;
    //   0	76	0	llllIIllIIllllI	Ljava/lang/Exception;
    //   0	76	3	llllIIllIIllIll	F
    //   0	76	1	llllIIllIIlllIl	J
    //   0	76	2	llllIIllIIlllII	B
    //   70	4	2	llllIIllIlIIIIl	Ljava/lang/Exception;
    // Exception table:
    //   from	to	target	type
    //   0	68	69	java/lang/Exception
  }
  
  private static String lIIlIlll(String llllIIllIlIllIl, float llllIIllIlIlIlI) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: getstatic core/anticheat/checks/Ping.lIIlIIl : [I
    //   22: bipush #6
    //   24: iaload
    //   25: invokestatic copyOf : ([BI)[B
    //   28: ldc 'DES'
    //   30: invokespecial <init> : ([BLjava/lang/String;)V
    //   33: astore_2
    //   34: ldc 'DES'
    //   36: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   39: astore_3
    //   40: aload_3
    //   41: getstatic core/anticheat/checks/Ping.lIIlIIl : [I
    //   44: iconst_2
    //   45: iaload
    //   46: aload_2
    //   47: invokevirtual init : (ILjava/security/Key;)V
    //   50: new java/lang/String
    //   53: dup
    //   54: aload_3
    //   55: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   58: aload_0
    //   59: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   62: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   65: invokevirtual decode : ([B)[B
    //   68: invokevirtual doFinal : ([B)[B
    //   71: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   74: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   77: areturn
    //   78: astore_2
    //   79: aload_2
    //   80: invokevirtual printStackTrace : ()V
    //   83: aconst_null
    //   84: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   34	44	2	llllIIllIllIIII	Ljavax/crypto/spec/SecretKeySpec;
    //   0	85	3	llllIIllIlIlIII	F
    //   0	85	1	llllIIllIlIllII	Ljava/lang/String;
    //   0	85	0	llllIIllIlIlIll	C
    //   0	85	1	llllIIllIlIlIlI	F
    //   0	85	0	llllIIllIlIllIl	Ljava/lang/String;
    //   0	85	2	llllIIllIlIlIIl	J
    //   40	38	3	llllIIllIlIllll	Ljavax/crypto/Cipher;
    //   79	4	2	llllIIllIlIlllI	Ljava/lang/Exception;
    // Exception table:
    //   from	to	target	type
    //   0	77	78	java/lang/Exception
  }
  
  static {
    lIlIIlll();
    lIIlllII();
  }
  
  public void log(String llllIIllIlllIlI, byte llllIIllIllIllI) {
    if (!lIlIlIII(llllIIllIllIllI) || lIlIlIIl(this.debug))
      getLogger().info(llllIIllIlllIlI); 
  }
  
  public static int getPing(Player llllIIlllIlIlIl) {
    String llllIIlllIlIlII = Bukkit.getServer().getClass().getPackage().getName();
    String llllIIlllIlIIll = llllIIlllIlIlII.substring(llllIIlllIlIlII.lastIndexOf(lIIIIIl[lIIlIIl[1]]) + lIIlIIl[0], llllIIlllIlIlII.length());
    try {
      Class<?> llllIIlllIlIIlI = Class.forName(String.valueOf((new StringBuilder(lIIIIIl[lIIlIIl[0]])).append(llllIIlllIlIIll).append(lIIIIIl[lIIlIIl[2]])));
      Object llllIIlllIlIIIl = llllIIlllIlIIlI.cast(llllIIlllIlIlIl);
      Method llllIIlllIlIIII = llllIIlllIlIIIl.getClass().getMethod(lIIIIIl[lIIlIIl[3]], new Class[lIIlIIl[1]]);
      Object llllIIlllIIllll = llllIIlllIlIIII.invoke(llllIIlllIlIIIl, new Object[lIIlIIl[1]]);
      Field llllIIlllIIlllI = llllIIlllIIllll.getClass().getDeclaredField(lIIIIIl[lIIlIIl[4]]);
      return llllIIlllIIlllI.getInt(llllIIlllIIllll);
    } catch (Exception llllIIlllIIllIl) {
      llllIIlllIIllIl.printStackTrace();
      return lIIlIIl[1];
    } 
  }
  
  private static boolean lIlIlIIl(char llllIIllIIllIIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  public void log(String llllIIlllIIIIIl) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic core/anticheat/checks/Ping.lIIlIIl : [I
    //   5: iconst_1
    //   6: iaload
    //   7: invokevirtual log : (Ljava/lang/String;Z)V
    //   10: return
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	11	0	llllIIlllIIIIlI	Lcore/anticheat/checks/Ping;
    //   0	11	1	llllIIllIllllll	C
    //   0	11	0	llllIIlllIIIIII	J
    //   0	11	1	llllIIlllIIIIIl	Ljava/lang/String;
  }
  
  private static boolean lIlIlIII(float llllIIllIIlIlll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\Ping.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */