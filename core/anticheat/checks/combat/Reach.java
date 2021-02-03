package core.anticheat.checks.combat;

import core.anticheat.api.onEnable;
import core.anticheat.checks.CheckResult;
import core.anticheat.checks.CheckType;
import core.anticheat.util.Distance;
import core.anticheat.util.Settings;
import org.bukkit.entity.Entity;

public class Reach {
  private static void llIII() {
    lII = new String[llll[5]];
    lII[llll[0]] = lI("89QWBaT4b3k=", "TclKH");
    lII[llll[1]] = lI("DAObyCfwlh4=", "StGGe");
    lII[llll[2]] = lIll("J1OhmoOQ8fihobcUAILS7LXGk3Uckurwcbz2sftl+wo=", "nVzHx");
    lII[llll[3]] = lI("rOvoWmly8fOLkUYHwSM1otMvpAuKPkMJPoOSYJErEXE=", "YqMRO");
    lII[llll[4]] = lI("qGFCS6qBt2w=", "VcPiE");
  }
  
  private static boolean lllII(boolean llllllIlIllllIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 <= null);
  }
  
  private static int llIlI(double paramDouble1, double paramDouble2) {
    return paramDouble1 cmp paramDouble2;
  }
  
  public static CheckResult runCheck(boolean llllllIllIlllll, Entity llllllIlllIIIll) {
    Distance llllllIlllIIIlI = new Distance(llllllIllIlllll.getPlayer().getLocation(), llllllIlllIIIll.getLocation());
    double llllllIlllIIIIl = llllllIlllIIIlI.getXDifference();
    double llllllIlllIIIII = llllllIlllIIIlI.getZDifference();
    return llIll(llllllIllIlllll.getPlayer().isOp()) ? PASS : (llIll(llllllIllIlllll.getPlayer().hasPermission(String.valueOf((new StringBuilder(String.valueOf(Settings.NAME))).append(lII[llll[1]])))) ? PASS : ((!lllII(llIlI(llllllIlllIIIIl, onEnable.config.getInt(lII[llll[2]]))) || lllIl(llIlI(llllllIlllIIIII, onEnable.config.getInt(lII[llll[3]])))) ? new CheckResult(llll[1], CheckType.REACH, lII[llll[4]]) : PASS));
  }
  
  private static boolean lllIl(float llllllIlIlllIll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > null);
  }
  
  private static String lI(int llllllIllIIIlII, float llllllIllIIIIll) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: getstatic core/anticheat/checks/combat/Reach.llll : [I
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
    //   41: getstatic core/anticheat/checks/combat/Reach.llll : [I
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
    //   0	85	0	llllllIllIIIllI	Ljava/lang/String;
    //   0	85	3	llllllIllIIIIIl	C
    //   40	38	3	llllllIllIIlIII	Ljavax/crypto/Cipher;
    //   34	44	2	llllllIllIIlIIl	Ljavax/crypto/spec/SecretKeySpec;
    //   0	85	1	llllllIllIIIlIl	Ljava/lang/String;
    //   0	85	2	llllllIllIIIIlI	Ljava/lang/String;
    //   79	4	2	llllllIllIIIlll	Ljava/lang/Exception;
    //   0	85	1	llllllIllIIIIll	F
    //   0	85	0	llllllIllIIIlII	I
    // Exception table:
    //   from	to	target	type
    //   0	77	78	java/lang/Exception
  }
  
  private static String lIll(String llllllIllIlIIll, float llllllIllIlIIII) {
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
    //   32: getstatic core/anticheat/checks/combat/Reach.llll : [I
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
    //   70	4	2	llllllIllIlIlII	Ljava/lang/Exception;
    //   0	76	0	llllllIllIlIIIl	C
    //   0	76	1	llllllIllIlIIlI	Ljava/lang/String;
    //   0	76	1	llllllIllIlIIII	F
    //   0	76	2	llllllIllIIllll	I
    //   0	76	3	llllllIllIIlllI	D
    //   0	76	0	llllllIllIlIIll	Ljava/lang/String;
    //   25	44	2	llllllIllIlIllI	Ljavax/crypto/spec/SecretKeySpec;
    //   31	38	3	llllllIllIlIlIl	Ljavax/crypto/Cipher;
    // Exception table:
    //   from	to	target	type
    //   0	68	69	java/lang/Exception
  }
  
  private static void llIIl() {
    llll = new int[7];
    llll[0] = (0x4E ^ 0x51 ^ 0x24 ^ 0x7C) & (0xF5 ^ 0xA9 ^ 0xDE ^ 0xC5 ^ -" ".length());
    llll[1] = " ".length();
    llll[2] = "  ".length();
    llll[3] = "   ".length();
    llll[4] = 0x1D ^ 0x19;
    llll[5] = 0x76 ^ 0x73;
    llll[6] = 0xA ^ 0x14 ^ 0x20 ^ 0x36;
  }
  
  private static boolean llIll(String llllllIlIllllll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  static {
    llIIl();
    llIII();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\combat\Reach.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */