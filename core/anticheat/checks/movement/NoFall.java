package core.anticheat.checks.movement;

import core.anticheat.checks.CheckResult;
import core.anticheat.checks.CheckType;
import core.anticheat.util.Settings;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;

public class NoFall {
  private static boolean lIIIlIlI(char llllIllIlIlllII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > null);
  }
  
  private static int lIIIlIII(double paramDouble1, double paramDouble2) {
    return paramDouble1 cmp paramDouble2;
  }
  
  private static void llllllI() {
    llIIlI = new String[llIllI[3]];
    llIIlI[llIllI[0]] = lllIllI("LWzsNxbWGIM=", "PvFfH");
    llIIlI[llIllI[1]] = llllIlI("kR3dhbl4rMo=", "siffB");
    llIIlI[llIllI[2]] = lllIllI("r+wyK86f7kw=", "JXlUF");
  }
  
  private static boolean lIIIIllI(short llllIllIllIIIll, float llllIllIllIIIlI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static boolean lIIIIlll(Exception llllIllIlIllllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
  
  public static CheckResult runCheck(float llllIlllIIlIlII, byte llllIlllIIlIIll) {
    if (lIIIIlII(llllIlllIIlIlII.getPlayer().isOp()))
      return PASS; 
    if (lIIIIlII(llllIlllIIlIlII.getPlayer().hasPermission(String.valueOf((new StringBuilder(String.valueOf(Settings.NAME))).append(llIIlI[llIllI[1]])))))
      return PASS; 
    if (lIIIIlII(llllIlllIIlIlII.getPlayer().isFlying()))
      return PASS; 
    if (!lIIIIlIl(llllIlllIIlIlII.getPlayer().getGameMode(), GameMode.CREATIVE) || lIIIIllI(llllIlllIIlIlII.getPlayer().getGameMode(), GameMode.SPECTATOR))
      return PASS; 
    boolean llllIlllIIlIlll = isNearGround(llllIlllIIlIIll.getTo());
    boolean llllIlllIIlIllI = thislastOnGround;
    thislastOnGround = llllIlllIIlIlll;
    boolean llllIlllIIlIlIl = thislastLastOnGround;
    thislastLastOnGround = llllIlllIIlIllI;
    return (lIIIIlll(llllIlllIIlIlll) && lIIIIlll(llllIlllIIlIllI) && lIIIIlll(llllIlllIIlIlIl) && lIIIIlII(llllIlllIIlIlII.getPlayer().isOnGround())) ? new CheckResult(llIllI[1], CheckType.NOFALL, llIIlI[llIllI[2]]) : PASS;
  }
  
  private static String lllIllI(float llllIllIllIllIl, boolean llllIllIllIllII) {
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
    //   32: getstatic core/anticheat/checks/movement/NoFall.llIllI : [I
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
    //   0	76	3	llllIllIllIlIlI	D
    //   31	38	3	llllIllIlllIIIl	Ljavax/crypto/Cipher;
    //   0	76	1	llllIllIllIlllI	Ljava/lang/String;
    //   0	76	1	llllIllIllIllII	Z
    //   70	4	2	llllIllIlllIIII	Ljava/lang/Exception;
    //   0	76	2	llllIllIllIlIll	S
    //   0	76	0	llllIllIllIllll	Ljava/lang/String;
    //   25	44	2	llllIllIlllIIlI	Ljavax/crypto/spec/SecretKeySpec;
    //   0	76	0	llllIllIllIllIl	F
    // Exception table:
    //   from	to	target	type
    //   0	68	69	java/lang/Exception
  }
  
  public static boolean isNearGround(Location llllIlllIIIlIll) {
    double llllIlllIIIlIlI = 0.3D;
    double llllIlllIIIlIIl = -llllIlllIIIlIlI;
    "".length();
    if (null != null)
      return (0x36 ^ 0x27) & (0x3B ^ 0x2A ^ 0xFFFFFFFF); 
    while (!lIIIlIlI(lIIIlIII(llllIlllIIIlIIl, llllIlllIIIlIlI))) {
      double llllIlllIIIlIII = -llllIlllIIIlIlI;
      "".length();
      if (null != null)
        return (0xC7 ^ 0x83) & (0x6 ^ 0x42 ^ 0xFFFFFFFF); 
      while (!lIIIlIlI(lIIIlIII(llllIlllIIIlIII, llllIlllIIIlIlI))) {
        if (lIIIIlIl(llllIlllIIIlIll.clone().add(llllIlllIIIlIIl, -0.5001D, llllIlllIIIlIII).getBlock().getType(), Material.AIR))
          return llIllI[1]; 
        llllIlllIIIlIII += llllIlllIIIlIlI;
      } 
      llllIlllIIIlIIl += llllIlllIIIlIlI;
    } 
    return llIllI[0];
  }
  
  private static String llllIlI(boolean llllIllIllllIlI, double llllIllIllllIIl) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: getstatic core/anticheat/checks/movement/NoFall.llIllI : [I
    //   22: iconst_4
    //   23: iaload
    //   24: invokestatic copyOf : ([BI)[B
    //   27: ldc_w 'DES'
    //   30: invokespecial <init> : ([BLjava/lang/String;)V
    //   33: astore_2
    //   34: ldc_w 'DES'
    //   37: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   40: astore_3
    //   41: aload_3
    //   42: getstatic core/anticheat/checks/movement/NoFall.llIllI : [I
    //   45: iconst_2
    //   46: iaload
    //   47: aload_2
    //   48: invokevirtual init : (ILjava/security/Key;)V
    //   51: new java/lang/String
    //   54: dup
    //   55: aload_3
    //   56: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   59: aload_0
    //   60: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   63: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   66: invokevirtual decode : ([B)[B
    //   69: invokevirtual doFinal : ([B)[B
    //   72: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   75: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   78: areturn
    //   79: astore_2
    //   80: aload_2
    //   81: invokevirtual printStackTrace : ()V
    //   84: aconst_null
    //   85: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	86	0	llllIllIlllllII	Ljava/lang/String;
    //   41	38	3	llllIllIllllllI	Ljavax/crypto/Cipher;
    //   0	86	1	llllIllIllllIll	Ljava/lang/String;
    //   0	86	3	llllIllIlllIlll	Z
    //   34	45	2	llllIllIlllllll	Ljavax/crypto/spec/SecretKeySpec;
    //   0	86	2	llllIllIllllIII	D
    //   0	86	1	llllIllIllllIIl	D
    //   80	4	2	llllIllIlllllIl	Ljava/lang/Exception;
    //   0	86	0	llllIllIllllIlI	Z
    // Exception table:
    //   from	to	target	type
    //   0	78	79	java/lang/Exception
  }
  
  private static boolean lIIIIlIl(char llllIllIllIIlll, int llllIllIllIIllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static void lIIIIIll() {
    llIllI = new int[5];
    llIllI[0] = (0x76 ^ 0x28) & (0x4 ^ 0x5A ^ 0xFFFFFFFF);
    llIllI[1] = " ".length();
    llIllI[2] = "  ".length();
    llIllI[3] = "   ".length();
    llIllI[4] = 0x6 ^ 0xE;
  }
  
  private static boolean lIIIIlII(Exception llllIllIllIIIII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  static {
    lIIIIIll();
    llllllI();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\movement\NoFall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */