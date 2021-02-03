package core.anticheat.checks.movement;

import core.anticheat.checks.CheckResult;
import core.anticheat.checks.CheckType;
import core.anticheat.util.Distance;
import core.anticheat.util.Settings;
import core.anticheat.util.User;

public class Sneak {
  private static boolean lIIIIIl(float lllllIlIllllllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static boolean lIIIllI(int lllllIllIIIIIIl, float lllllIllIIIIIII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static String lIIIll(String lllllIllIIllllI, float lllllIllIIllIII) {
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
    //   37: getstatic core/anticheat/checks/movement/Sneak.lIIlIl : [I
    //   40: iconst_0
    //   41: iaload
    //   42: istore #4
    //   44: aload_0
    //   45: invokevirtual toCharArray : ()[C
    //   48: astore #5
    //   50: aload #5
    //   52: arraylength
    //   53: istore #6
    //   55: getstatic core/anticheat/checks/movement/Sneak.lIIlIl : [I
    //   58: iconst_0
    //   59: iaload
    //   60: istore #7
    //   62: iload #7
    //   64: iload #6
    //   66: invokestatic lIIIllI : (II)Z
    //   69: ifeq -> 127
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
    //   112: ldc ' '
    //   114: invokevirtual length : ()I
    //   117: ldc '   '
    //   119: invokevirtual length : ()I
    //   122: if_icmpne -> 62
    //   125: aconst_null
    //   126: areturn
    //   127: aload_2
    //   128: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   131: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	132	0	lllllIllIIllIIl	I
    //   0	132	1	lllllIllIIlllIl	Ljava/lang/String;
    //   0	132	1	lllllIllIIllIII	F
    //   0	132	2	lllllIllIIlIlll	J
    //   32	100	2	lllllIllIIlllII	Ljava/lang/StringBuilder;
    //   0	132	5	lllllIllIIlIlII	Z
    //   0	132	0	lllllIllIIllllI	Ljava/lang/String;
    //   37	95	3	lllllIllIIllIll	[C
    //   0	132	4	lllllIllIIlIlIl	J
    //   44	88	4	lllllIllIIllIlI	I
    //   0	132	6	lllllIllIIlIIll	C
    //   0	132	3	lllllIllIIlIllI	Ljava/lang/Exception;
    //   79	24	8	lllllIllIIlllll	C
    //   0	132	8	lllllIllIIlIIIl	Z
    //   0	132	7	lllllIllIIlIIlI	B
  }
  
  private static String lIIlII(boolean lllllIllIIIIlll, String lllllIllIIIlIII) {
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
    //   32: getstatic core/anticheat/checks/movement/Sneak.lIIlIl : [I
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
    //   0	76	1	lllllIllIIIIllI	I
    //   0	76	3	lllllIllIIIIlII	Z
    //   25	44	2	lllllIllIIIllII	Ljavax/crypto/spec/SecretKeySpec;
    //   70	4	2	lllllIllIIIlIlI	Ljava/lang/Exception;
    //   31	38	3	lllllIllIIIlIll	Ljavax/crypto/Cipher;
    //   0	76	1	lllllIllIIIlIII	Ljava/lang/String;
    //   0	76	0	lllllIllIIIlIIl	Ljava/lang/String;
    //   0	76	0	lllllIllIIIIlll	Z
    //   0	76	2	lllllIllIIIIlIl	B
    // Exception table:
    //   from	to	target	type
    //   0	68	69	java/lang/Exception
  }
  
  public static CheckResult runCheck(User lllllIllIlIlIll, Distance lllllIllIlIlIlI) {
    return lIIIIIl(lllllIllIlIlIll.getPlayer().isOp()) ? PASS : (lIIIIIl(lllllIllIlIlIll.getPlayer().hasPermission(String.valueOf((new StringBuilder(String.valueOf(Settings.NAME))).append(lIlll[lIIlIl[1]])))) ? PASS : (lIIIIIl(lllllIllIlIlIll.getPlayer().isFlying()) ? PASS : ((lIIIIIl(lllllIllIlIlIll.getPlayer().isSneaking()) && lIIIIIl(lllllIllIlIlIll.getPlayer().isSprinting())) ? new CheckResult(lIIlIl[1], CheckType.SNEAK, lIlll[lIIlIl[2]]) : PASS)));
  }
  
  private static void llIIIl() {
    lIlll = new String[lIIlIl[3]];
    lIlll[lIIlIl[0]] = lIIIll("", "khKhI");
    lIlll[lIIlIl[1]] = lIIlII("55/TPlGOy3Q=", "NcxoF");
    lIlll[lIIlIl[2]] = lIIlII("fxu8ka1yjO8=", "ZHoor");
  }
  
  private static void lIIIIII() {
    lIIlIl = new int[4];
    lIIlIl[0] = (0x4A ^ 0x46 ^ 0xA3 ^ 0xB3) & (0x5A ^ 0x2A ^ 0x8 ^ 0x64 ^ -" ".length());
    lIIlIl[1] = " ".length();
    lIIlIl[2] = "  ".length();
    lIIlIl[3] = "   ".length();
  }
  
  static {
    lIIIIII();
    llIIIl();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\movement\Sneak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */