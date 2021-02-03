package core.anticheat.checks.combat;

import core.anticheat.api.onEnable;
import core.anticheat.checks.CheckResult;
import core.anticheat.checks.CheckType;
import core.anticheat.util.Settings;
import core.anticheat.util.User;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bukkit.entity.Entity;

public class HitSpeed {
  private static String lIIlIIll(String llllIlIIIIlIlIl, String llllIlIIIIlIIlI) {
    try {
      SecretKeySpec llllIlIIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
      Cipher llllIlIIIIlIlll = Cipher.getInstance("Blowfish");
      llllIlIIIIlIlll.init(lIIIlll[2], llllIlIIIIllIII);
      return new String(llllIlIIIIlIlll.doFinal(Base64.getDecoder().decode(llllIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
    } catch (Exception llllIlIIIIlIllI) {
      llllIlIIIIlIllI.printStackTrace();
      return null;
    } 
  }
  
  private static boolean lIlIIIIl(Exception llllIIllllIIIIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static boolean lIlIIIll(boolean llllIIllllIlIII, int llllIIllllIIlll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static boolean lIlIIIlI(char llllIIllllIIlII, char llllIIllllIIIll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static void lIlIIIII() {
    lIIIlll = new int[6];
    lIIIlll[0] = (0x72 ^ 0x65) & (0x65 ^ 0x72 ^ 0xFFFFFFFF);
    lIIIlll[1] = " ".length();
    lIIIlll[2] = "  ".length();
    lIIIlll[3] = "   ".length();
    lIIIlll[4] = 0xC4 ^ 0xC0;
    lIIIlll[5] = 0xC7 ^ 0xB9 ^ 0x56 ^ 0x20;
  }
  
  private static String lIIlIIlI(String llllIIlllllIIII, String llllIIllllIllIl) {
    try {
      SecretKeySpec llllIIlllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIllllIllIl.getBytes(StandardCharsets.UTF_8)), lIIIlll[5]), "DES");
      Cipher llllIIlllllIIlI = Cipher.getInstance("DES");
      llllIIlllllIIlI.init(lIIIlll[2], llllIIlllllIIll);
      return new String(llllIIlllllIIlI.doFinal(Base64.getDecoder().decode(llllIIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
    } catch (Exception llllIIlllllIIIl) {
      llllIIlllllIIIl.printStackTrace();
      return null;
    } 
  }
  
  private static String lIIlIlII(String llllIlIIIIIIlIl, long llllIIlllllllll) {
    // Byte code:
    //   0: new java/lang/String
    //   3: dup
    //   4: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   7: aload_0
    //   8: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   11: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   14: invokevirtual decode : ([B)[B
    //   17: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   20: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   23: astore_0
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore_2
    //   32: aload_1
    //   33: invokevirtual toCharArray : ()[C
    //   36: astore_3
    //   37: getstatic core/anticheat/checks/combat/HitSpeed.lIIIlll : [I
    //   40: iconst_0
    //   41: iaload
    //   42: istore #4
    //   44: aload_0
    //   45: invokevirtual toCharArray : ()[C
    //   48: astore #5
    //   50: aload #5
    //   52: arraylength
    //   53: istore #6
    //   55: getstatic core/anticheat/checks/combat/HitSpeed.lIIIlll : [I
    //   58: iconst_0
    //   59: iaload
    //   60: istore #7
    //   62: iload #7
    //   64: iload #6
    //   66: invokestatic lIlIIIll : (II)Z
    //   69: ifeq -> 128
    //   72: aload #5
    //   74: iload #7
    //   76: caload
    //   77: istore #8
    //   79: aload_2
    //   80: iload #8
    //   82: aload_3
    //   83: iload #4
    //   85: aload_3
    //   86: arraylength
    //   87: irem
    //   88: caload
    //   89: ixor
    //   90: i2c
    //   91: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   94: ldc ''
    //   96: invokevirtual length : ()I
    //   99: pop2
    //   100: iinc #4, 1
    //   103: iinc #7, 1
    //   106: ldc ''
    //   108: invokevirtual length : ()I
    //   111: pop
    //   112: ldc '  '
    //   114: invokevirtual length : ()I
    //   117: ldc ' '
    //   119: invokevirtual length : ()I
    //   122: ineg
    //   123: if_icmpne -> 62
    //   126: aconst_null
    //   127: areturn
    //   128: aload_2
    //   129: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   132: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	133	6	llllIIllllllIlI	Ljava/lang/Exception;
    //   79	24	8	llllIlIIIIIIllI	C
    //   0	133	8	llllIIllllllIII	I
    //   0	133	1	llllIlIIIIIIlII	Ljava/lang/String;
    //   0	133	3	llllIIlllllllIl	B
    //   0	133	0	llllIlIIIIIIIII	Ljava/lang/Exception;
    //   0	133	5	llllIIllllllIll	F
    //   0	133	4	llllIIlllllllII	Z
    //   0	133	1	llllIIlllllllll	J
    //   32	101	2	llllIlIIIIIIIll	Ljava/lang/StringBuilder;
    //   0	133	2	llllIIllllllllI	D
    //   0	133	0	llllIlIIIIIIlIl	Ljava/lang/String;
    //   44	89	4	llllIlIIIIIIIIl	I
    //   0	133	7	llllIIllllllIIl	D
    //   37	96	3	llllIlIIIIIIIlI	[C
  }
  
  private static void lIIlIlIl() {
    llllIl = new String[lIIIlll[4]];
    llllIl[lIIIlll[0]] = lIIlIIlI("HnaA9MmSwVM=", "jlmcG");
    llllIl[lIIIlll[1]] = lIIlIIll("6+Ks+bxnFFo=", "cNLBY");
    llllIl[lIIIlll[2]] = lIIlIlII("FhsjCT4GXS4DIQYDIw8xWwAjHiEcHSEZexgSPjU2BQA=", "usFjU");
    llllIl[lIIIlll[3]] = lIIlIIll("idIeB7zxumI=", "HBbLm");
  }
  
  public static CheckResult runCheck(User llllIlIIIIlllll, Entity llllIlIIIIllllI) {
    if (lIlIIIIl(llllIlIIIIlllll.getPlayer().isOp()))
      return PASS; 
    if (lIlIIIIl(llllIlIIIIlllll.getPlayer().hasPermission(String.valueOf((new StringBuilder(String.valueOf(Settings.NAME))).append(llllIl[lIIIlll[1]])))))
      return PASS; 
    llllIlIIIIlllll.addHit();
    return lIlIIIlI(llllIlIIIIlllll.getHits(), onEnable.config.getInt(llllIl[lIIIlll[2]])) ? new CheckResult(lIIIlll[1], CheckType.HITSPEED, llllIl[lIIIlll[3]]) : PASS;
  }
  
  static {
    lIlIIIII();
    lIIlIlIl();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\combat\HitSpeed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */