package core.anticheat.commands;

import core.anticheat.Core;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Anticheat {
  private static boolean llIIIllI(Exception lllIlllIlIlIlIl, Exception lllIlllIlIlIlII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static boolean llIIIlIl(boolean lllIlllIlIlIIIl, int lllIlllIlIlIIII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static void lIllIIll() {
    llIlII = new String[lIIlllI[74]];
    llIlII[lIIlllI[0]] = lllllIl("51B8J/QNL6ECVvn8qZ33lw==", "pYogH");
    llIlII[lIIlllI[1]] = lllllIl("vRgV7mmKLkw=", "waTDq");
    llIlII[lIIlllI[2]] = lllllll("YiegkKNn0B0=", "KyndI");
    llIlII[lIIlllI[3]] = lllllll("CIPM8xQvUn4=", "PdALJ");
    llIlII[lIIlllI[4]] = lIIIIIIl("w6gUJSE2LBpGITw4UQsoPTZRECA8IxASIDwhAkY6PCIUCSc2bxkHOnMpHhRpNi4SDmk7LhINaSY8GAgu", "OqfIS");
    llIlII[lIIlllI[5]] = lllllIl("X2+TMWEOIsk=", "ZnbqS");
    llIlII[lIIlllI[6]] = lllllll("BNV8XBugManP7lACdY3Bxw==", "DNiva");
    llIlII[lIIlllI[7]] = lllllIl("a7uHCuCkr0o=", "ynZNs");
    llIlII[lIIlllI[8]] = lllllIl("hbe4GAq0DtnvKma7OmZDWBqNF9zYKaK1dvqGbVftF0Z272jPiYWmdnUC0p3zYpQD", "wByqJ");
    llIlII[lIIlllI[9]] = lIIIIIIl("w4Mqdw==", "dKXcG");
    llIlII[lIIlllI[10]] = lIIIIIIl("SA88HiEOGA==", "haSjH");
    llIlII[lIIlllI[11]] = lIIIIIIl("", "fZtrr");
    llIlII[lIIlllI[12]] = lllllll("ZuZuxX1WhPyCqot3wy2pqmvjeKLQ+1f36x2fL284lfg=", "VHjFX");
    llIlII[lIIlllI[13]] = lIIIIIIl("w6oNeg==", "MlUAj");
    llIlII[lIIlllI[14]] = lllllll("7VkOplQNwGI=", "KKTtU");
    llIlII[lIIlllI[15]] = lIIIIIIl("", "Oxjdm");
    llIlII[lIIlllI[16]] = lllllIl("QIn9yGHurb8=", "RfbVD");
    llIlII[lIIlllI[17]] = lllllIl("O7oTGaz+z3o=", "bstLq");
    llIlII[lIIlllI[18]] = lllllIl("y23Z+VuEdj0=", "GhUob");
    llIlII[lIIlllI[19]] = lllllIl("IX5Hg0SdNOE=", "yNXpp");
    llIlII[lIIlllI[20]] = lIIIIIIl("w7A=", "WFMJq");
    llIlII[lIIlllI[21]] = lIIIIIIl("CwozZzs7CSpnIj1FKigiNQA0Zy43RSgoODsDLyIocgogZy08HGYvLTEOIzU/fA==", "ReFGL");
    llIlII[lIIlllI[22]] = lIIIIIIl("FjsfByIe", "fIzaK");
    llIlII[lIIlllI[23]] = lllllll("iYMNH2hVe08=", "FZiwa");
    llIlII[lIIlllI[24]] = lllllIl("rwT5T52Qg2U=", "Owgnh");
    llIlII[lIIlllI[25]] = lIIIIIIl("EQAzYx0hAypjBCcYZiEPaAEpNwMuBiMnSicJZiIEMU8uIgkjCjQwRA==", "HoFCj");
    llIlII[lIIlllI[26]] = lllllll("0eH/PUPwNKc=", "SUreE");
    llIlII[lIIlllI[27]] = lIIIIIIl("dA==", "Roeij");
    llIlII[lIIlllI[28]] = lllllIl("bK5u044c8Uw=", "pzzwm");
    llIlII[lIIlllI[29]] = lllllll("qPlx7YTENgwpZ73jQsMtmw==", "WaoLz");
    llIlII[lIIlllI[30]] = lIIIIIIl("FQEEJQY=", "viaFm");
    llIlII[lIIlllI[31]] = lllllll("1v3wt3c9l2c=", "zuOmT");
    llIlII[lIIlllI[32]] = lllllIl("Dn+uzv0xgZfooCrZQJk63Q==", "oKwOj");
    llIlII[lIIlllI[33]] = lllllll("NyZXKhA1jX0AyKyT+9/Jpg==", "fOxPz");
    llIlII[lIIlllI[34]] = lIIIIIIl("JjsvMhUkJGA=", "VWNKp");
    llIlII[lIIlllI[35]] = lllllll("EJFJvJBZqGdqWBHGbriymQ==", "nGmkJ");
    llIlII[lIIlllI[36]] = lllllll("OeHxB3Dm13n7dWzuwWnEAQ==", "joxCn");
    llIlII[lIIlllI[37]] = lIIIIIIl("ZjwjMzc4MS8jGz44", "HTJGD");
    llIlII[lIIlllI[38]] = lIIIIIIl("AQorKyIDFWQ=", "qfJRG");
    llIlII[lIIlllI[39]] = lIIIIIIl("WAcoBAAGLj0E", "vqKhi");
    llIlII[lIIlllI[40]] = lllllIl("GjIu5n3kKXIL/rdcCfdITA==", "pijyA");
    llIlII[lIIlllI[41]] = lllllll("bV1SgLWITGrxuow7p4iFqQ==", "YVOYX");
    llIlII[lIIlllI[42]] = lllllIl("i5yPawwCOOwoXiL0n2CQbA==", "hQWDe");
    llIlII[lIIlllI[43]] = lllllIl("bqrzWLHKsyEBZfzWQmIGYw==", "UbZzq");
    llIlII[lIIlllI[44]] = lllllIl("aUDTSrjqhT7s3L6ZmF78Jg==", "jUyGl");
    llIlII[lIIlllI[45]] = lllllll("L5LidlIMif/4Pz/jUBPjMg==", "hccIC");
    llIlII[lIIlllI[46]] = lllllll("wFFdA0AyJNk=", "VgLmA");
    llIlII[lIIlllI[47]] = lllllIl("q2W2Y8WbUlKPKV8VeMn5yi+YuNK78ahg", "mOxBk");
    llIlII[lIIlllI[48]] = lllllIl("BOm8mcJxXind9EBO3MPPxw==", "MIQYv");
    llIlII[lIIlllI[49]] = lllllll("pQSg0LH0ZN/PgWhDl34ipw==", "LOQQD");
    llIlII[lIIlllI[50]] = lllllIl("ptPn0e+ru/A4i0eOMJL6bQ==", "eewGh");
    llIlII[lIIlllI[51]] = lIIIIIIl("GR8WGy81HwgOfHTDjRk=", "TjzoF");
    llIlII[lIIlllI[52]] = lIIIIIIl("JSwEIRUDJScrEQckDyoTWGnDjSc=", "bIjDg");
    llIlII[lIIlllI[53]] = lllllll("gS1CMeoOndWd4E+zMz/jzw==", "MplRz");
    llIlII[lIIlllI[54]] = lllllll("qoON7li1PhezWBZ7MrsI1A==", "JLdzI");
    llIlII[lIIlllI[55]] = lIIIIIIl("w5AmOwkvBGUfDScOIB1BLhY2Tw8jASAdQSwYLAEEIlcxBwRmBCAdFyMFZQ0EIBg3Ck8=", "wEoaF");
    llIlII[lIIlllI[56]] = lllllll("Hnz4MK5vohs=", "VyjdX");
    llIlII[lIIlllI[57]] = lllllll("wPEbkRQcdW5HaMj8rMaKNA==", "xcwVm");
    llIlII[lIIlllI[58]] = lllllll("UmpgtJTLk9w=", "CHzDT");
    llIlII[lIIlllI[59]] = lllllll("TCy75xS2PrY=", "YUJHr");
    llIlII[lIIlllI[60]] = lllllll("qADfOTi9DS4=", "llGno");
    llIlII[lIIlllI[61]] = lllllll("ZGQvaf4caj+jG8yPcEhxJw==", "JBnTZ");
    llIlII[lIIlllI[62]] = lIIIIIIl("ESk8Ng4H", "cLPYo");
    llIlII[lIIlllI[63]] = lIIIIIIl("WTgiCAEWLg==", "wJGdn");
    llIlII[lIIlllI[64]] = lllllll("uW0bmaXYe7+TJHdr5NC6ow==", "ZFsuH");
    llIlII[lIIlllI[65]] = lllllIl("VkZ6TCAOB462f59aSYH8dQ==", "COnLL");
    llIlII[lIIlllI[66]] = lllllll("9UXfut4F8W8=", "VQDqB");
    llIlII[lIIlllI[67]] = lllllIl("uxxi4abYMMM=", "joWNL");
    llIlII[lIIlllI[68]] = lllllll("f0/4cVF6gvg=", "YlwcN");
    llIlII[lIIlllI[69]] = lllllll("IDZYVLsDoBgPixbocdZsVmTUdkm0+A5iOEJFQwMRhrwPcAZ0+EjGcQ==", "AMTaw");
    llIlII[lIIlllI[70]] = lllllIl("N8lwGFyljdw=", "rRhxV");
    llIlII[lIIlllI[71]] = lllllll("icLGlugiUOs=", "AMvAm");
    llIlII[lIIlllI[72]] = lllllll("zq7Q8Sq+QN8=", "kiUBX");
    llIlII[lIIlllI[73]] = lllllIl("pwgxG/BY+aImOvF4FkBOqw==", "UbfdI");
  }
  
  private static boolean llIIIIIl(double lllIlllIlIIlllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static String lllllIl(String lllIllllIIIIIlI, String lllIllllIIIIIIl) {
    try {
      SecretKeySpec lllIllllIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllI[8]), "DES");
      Cipher lllIllllIIIIlII = Cipher.getInstance("DES");
      lllIllllIIIIlII.init(lIIlllI[2], lllIllllIIIIlIl);
      return new String(lllIllllIIIIlII.doFinal(Base64.getDecoder().decode(lllIllllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
    } catch (Exception lllIllllIIIIIll) {
      lllIllllIIIIIll.printStackTrace();
      return null;
    } 
  }
  
  private static void llIIIIII() {
    lIIlllI = new int[75];
    lIIlllI[0] = (0x2C ^ 0x1D) & (0x40 ^ 0x71 ^ 0xFFFFFFFF);
    lIIlllI[1] = " ".length();
    lIIlllI[2] = "  ".length();
    lIIlllI[3] = "   ".length();
    lIIlllI[4] = 0x77 ^ 0x73;
    lIIlllI[5] = 0xE2 ^ 0x87 ^ 0x58 ^ 0x38;
    lIIlllI[6] = 0x4E ^ 0x48;
    lIIlllI[7] = 0x34 ^ 0x33;
    lIIlllI[8] = 0x61 ^ 0x69;
    lIIlllI[9] = 0xBE ^ 0x9E ^ 0x94 ^ 0xBD;
    lIIlllI[10] = 0xB6 ^ 0xBC;
    lIIlllI[11] = 0x79 ^ 0x72;
    lIIlllI[12] = 0xF2 ^ 0xA1 ^ 0x4B ^ 0x14;
    lIIlllI[13] = 0x9F ^ 0xBE ^ 0xB6 ^ 0x9A;
    lIIlllI[14] = 0x9A ^ 0x94;
    lIIlllI[15] = 0x6E ^ 0x61;
    lIIlllI[16] = 0x44 ^ 0x54;
    lIIlllI[17] = 0xB5 ^ 0xBB ^ 0x7D ^ 0x62;
    lIIlllI[18] = 0xAC ^ 0xBE;
    lIIlllI[19] = 0x7E ^ 0x6D;
    lIIlllI[20] = 0xAF ^ 0xBB;
    lIIlllI[21] = 0x71 ^ 0x64;
    lIIlllI[22] = 87 + 107 - 161 + 157 ^ 144 + 129 - 188 + 83;
    lIIlllI[23] = 0x21 ^ 0x19 ^ 0xAE ^ 0x81;
    lIIlllI[24] = 0x99 ^ 0x81;
    lIIlllI[25] = 0x1B ^ 0x2;
    lIIlllI[26] = 0xA2 ^ 0xA8 ^ 0x93 ^ 0x83;
    lIIlllI[27] = 0xBD ^ 0xA7 ^ " ".length();
    lIIlllI[28] = 0x14 ^ 0xA ^ "  ".length();
    lIIlllI[29] = 0x6C ^ 0x42 ^ 0xB4 ^ 0x87;
    lIIlllI[30] = 15 + 115 - 3 + 4 ^ 113 + 34 - 110 + 120;
    lIIlllI[31] = 0xB9 ^ 0x8D ^ 0x1E ^ 0x35;
    lIIlllI[32] = 120 + 2 - -20 + 8 ^ 103 + 96 - 155 + 138;
    lIIlllI[33] = 55 + 100 - 125 + 140 ^ 78 + 99 - 86 + 48;
    lIIlllI[34] = 0x51 ^ 0x73;
    lIIlllI[35] = 0xA2 ^ 0x81;
    lIIlllI[36] = 79 + 109 - 17 + 16 ^ 66 + 44 - -9 + 40;
    lIIlllI[37] = 0x97 ^ 0x83 ^ 0x67 ^ 0x56;
    lIIlllI[38] = 0x57 ^ 0x2D ^ 0xDD ^ 0x81;
    lIIlllI[39] = 0x4 ^ 0x22 ^ " ".length();
    lIIlllI[40] = 0x86 ^ 0xAE;
    lIIlllI[41] = 0x8A ^ 0xA3;
    lIIlllI[42] = 86 + 14 - 69 + 133 ^ 104 + 93 - 65 + 10;
    lIIlllI[43] = 0x6B ^ 0x40;
    lIIlllI[44] = 0x40 ^ 0x6C;
    lIIlllI[45] = 69 + 95 - 37 + 9 ^ 149 + 83 - 107 + 40;
    lIIlllI[46] = 9 + 91 - 25 + 103 ^ 78 + 41 - 99 + 136;
    lIIlllI[47] = 0xAD ^ 0xB9 ^ 0x90 ^ 0xAB;
    lIIlllI[48] = 0x32 ^ 0x2;
    lIIlllI[49] = 0xB8 ^ 0x89;
    lIIlllI[50] = 0x81 ^ 0x8E ^ 0xAF ^ 0x92;
    lIIlllI[51] = 123 + 27 - 130 + 131 ^ 92 + 55 - 119 + 136;
    lIIlllI[52] = 0x45 ^ 0x2A ^ 0x34 ^ 0x6F;
    lIIlllI[53] = 0x67 ^ 0x52;
    lIIlllI[54] = 0x85 ^ 0xB3;
    lIIlllI[55] = 0xD6 ^ 0x8A ^ 0xAD ^ 0xC6;
    lIIlllI[56] = 0x19 ^ 0x21;
    lIIlllI[57] = 0x2B ^ 0x44 ^ 0x64 ^ 0x32;
    lIIlllI[58] = 0x35 ^ 0xF;
    lIIlllI[59] = 0x6F ^ 0x4C ^ 0x73 ^ 0x6B;
    lIIlllI[60] = 0x66 ^ 0x5E ^ 0x87 ^ 0x83;
    lIIlllI[61] = 0x6C ^ 0x51;
    lIIlllI[62] = "  ".length() ^ 0x96 ^ 0xAA;
    lIIlllI[63] = 0x31 ^ 0xE;
    lIIlllI[64] = 0xDC ^ 0x9C;
    lIIlllI[65] = 0x21 ^ 0x50 ^ 0x7C ^ 0x4C;
    lIIlllI[66] = 0x3D ^ 0x7F;
    lIIlllI[67] = 0x5D ^ 0x1E;
    lIIlllI[68] = 0xC8 ^ 0x8C;
    lIIlllI[69] = 0x6B ^ 0x2E;
    lIIlllI[70] = 0xD9 ^ 0xC7 ^ 0x74 ^ 0x2C;
    lIIlllI[71] = 0xC ^ 0x4B;
    lIIlllI[72] = 41 + 32 - 15 + 85 ^ 126 + 18 - 66 + 121;
    lIIlllI[73] = 149 + 163 - 253 + 168 ^ 75 + 76 - 90 + 109;
    lIIlllI[74] = 0xD7 ^ 0x9D;
  }
  
  private static String lllllll(char lllIlllIlllIIll, String lllIlllIlllIlII) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc_w 'MD5'
    //   7: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   10: aload_1
    //   11: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   14: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   17: invokevirtual digest : ([B)[B
    //   20: ldc_w 'Blowfish'
    //   23: invokespecial <init> : ([BLjava/lang/String;)V
    //   26: astore_2
    //   27: ldc_w 'Blowfish'
    //   30: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   33: astore_3
    //   34: aload_3
    //   35: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   38: iconst_2
    //   39: iaload
    //   40: aload_2
    //   41: invokevirtual init : (ILjava/security/Key;)V
    //   44: new java/lang/String
    //   47: dup
    //   48: aload_3
    //   49: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   52: aload_0
    //   53: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   56: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   59: invokevirtual decode : ([B)[B
    //   62: invokevirtual doFinal : ([B)[B
    //   65: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   68: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   71: areturn
    //   72: astore_2
    //   73: aload_2
    //   74: invokevirtual printStackTrace : ()V
    //   77: aconst_null
    //   78: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	79	1	lllIlllIlllIIlI	B
    //   0	79	0	lllIlllIlllIlIl	Ljava/lang/String;
    //   73	4	2	lllIlllIlllIllI	Ljava/lang/Exception;
    //   0	79	3	lllIlllIlllIIII	Ljava/lang/String;
    //   27	45	2	lllIlllIllllIII	Ljavax/crypto/spec/SecretKeySpec;
    //   0	79	2	lllIlllIlllIIIl	J
    //   34	38	3	lllIlllIlllIlll	Ljavax/crypto/Cipher;
    //   0	79	1	lllIlllIlllIlII	Ljava/lang/String;
    //   0	79	0	lllIlllIlllIIll	C
    // Exception table:
    //   from	to	target	type
    //   0	71	72	java/lang/Exception
  }
  
  private static String lIIIIIIl(String lllIlllIllIIlIl, String lllIlllIllIIlII) {
    String str = new String(Base64.getDecoder().decode(lllIlllIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    StringBuilder lllIlllIllIIIll = new StringBuilder();
    char[] lllIlllIllIIIlI = lllIlllIllIIlII.toCharArray();
    int lllIlllIllIIIIl = lIIlllI[0];
    char[] arrayOfChar1 = str.toCharArray();
    int i = arrayOfChar1.length;
    int j = lIIlllI[0];
    while (llIIIllI(j, i)) {
      char lllIlllIllIIllI = arrayOfChar1[j];
      "".length();
      lllIlllIllIIIIl++;
      j++;
      "".length();
      if (-"   ".length() >= 0)
        return null; 
    } 
    return String.valueOf(lllIlllIllIIIll);
  }
  
  public boolean onCommand(CommandSender lllIllllIlIIIlI, Command lllIllllIlIIIIl, String lllIllllIlIIIII, int lllIllllIIlIIlI) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getName : ()Ljava/lang/String;
    //   4: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   7: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   10: iconst_0
    //   11: iaload
    //   12: aaload
    //   13: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   16: invokestatic llIIIIIl : (I)Z
    //   19: ifeq -> 2282
    //   22: aload #4
    //   24: arraylength
    //   25: invokestatic llIIIIlI : (I)Z
    //   28: ifeq -> 336
    //   31: aload_1
    //   32: new java/lang/StringBuilder
    //   35: dup
    //   36: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   39: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   42: iconst_1
    //   43: iaload
    //   44: aaload
    //   45: invokespecial <init> : (Ljava/lang/String;)V
    //   48: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   57: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   60: iconst_2
    //   61: iaload
    //   62: aaload
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: getstatic core/anticheat/commands/Anticheat.plugin : Lcore/anticheat/Core;
    //   69: invokevirtual getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   72: invokevirtual getVersion : ()Ljava/lang/String;
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   81: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   86: aload_1
    //   87: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   90: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   93: iconst_3
    //   94: iaload
    //   95: aaload
    //   96: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   101: aload_1
    //   102: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   105: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   108: iconst_4
    //   109: iaload
    //   110: aaload
    //   111: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   116: aload_1
    //   117: new java/lang/StringBuilder
    //   120: dup
    //   121: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   124: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   127: iconst_5
    //   128: iaload
    //   129: aaload
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   142: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   145: bipush #6
    //   147: iaload
    //   148: aaload
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   155: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   160: aload_1
    //   161: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   164: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   167: bipush #7
    //   169: iaload
    //   170: aaload
    //   171: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   176: aload_1
    //   177: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   180: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   183: bipush #8
    //   185: iaload
    //   186: aaload
    //   187: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   192: aload_1
    //   193: new java/lang/StringBuilder
    //   196: dup
    //   197: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   200: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   203: bipush #9
    //   205: iaload
    //   206: aaload
    //   207: invokespecial <init> : (Ljava/lang/String;)V
    //   210: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   219: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   222: bipush #10
    //   224: iaload
    //   225: aaload
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   232: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   237: aload_1
    //   238: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   241: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   244: bipush #11
    //   246: iaload
    //   247: aaload
    //   248: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   253: aload_1
    //   254: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   257: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   260: bipush #12
    //   262: iaload
    //   263: aaload
    //   264: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   269: aload_1
    //   270: new java/lang/StringBuilder
    //   273: dup
    //   274: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   277: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   280: bipush #13
    //   282: iaload
    //   283: aaload
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   296: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   299: bipush #14
    //   301: iaload
    //   302: aaload
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   309: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   314: aload_1
    //   315: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   318: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   321: bipush #15
    //   323: iaload
    //   324: aaload
    //   325: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   330: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   333: iconst_1
    //   334: iaload
    //   335: ireturn
    //   336: aload #4
    //   338: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   341: iconst_0
    //   342: iaload
    //   343: aaload
    //   344: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   347: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   350: bipush #16
    //   352: iaload
    //   353: aaload
    //   354: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   357: invokestatic llIIIIIl : (I)Z
    //   360: ifeq -> 847
    //   363: aload_1
    //   364: new java/lang/StringBuilder
    //   367: dup
    //   368: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   371: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   374: invokespecial <init> : (Ljava/lang/String;)V
    //   377: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   380: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   383: bipush #17
    //   385: iaload
    //   386: aaload
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   393: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   398: invokestatic llIIIIlI : (I)Z
    //   401: ifeq -> 416
    //   404: aload_1
    //   405: invokeinterface isOp : ()Z
    //   410: invokestatic llIIIIIl : (I)Z
    //   413: ifeq -> 775
    //   416: getstatic core/anticheat/Core.notify : Ljava/util/ArrayList;
    //   419: aload_1
    //   420: invokeinterface getName : ()Ljava/lang/String;
    //   425: invokevirtual contains : (Ljava/lang/Object;)Z
    //   428: invokestatic llIIIIIl : (I)Z
    //   431: ifeq -> 551
    //   434: getstatic core/anticheat/Core.notify : Ljava/util/ArrayList;
    //   437: aload_1
    //   438: invokeinterface getName : ()Ljava/lang/String;
    //   443: invokevirtual remove : (Ljava/lang/Object;)Z
    //   446: ldc ''
    //   448: invokevirtual length : ()I
    //   451: pop2
    //   452: aload_1
    //   453: new java/lang/StringBuilder
    //   456: dup
    //   457: getstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   460: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   463: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   466: bipush #18
    //   468: iaload
    //   469: aaload
    //   470: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   473: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   476: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   479: bipush #19
    //   481: iaload
    //   482: aaload
    //   483: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   486: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   489: bipush #20
    //   491: iaload
    //   492: aaload
    //   493: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   496: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   499: invokespecial <init> : (Ljava/lang/String;)V
    //   502: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   505: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   508: bipush #21
    //   510: iaload
    //   511: aaload
    //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   518: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   523: ldc ''
    //   525: invokevirtual length : ()I
    //   528: pop
    //   529: aconst_null
    //   530: ifnull -> 841
    //   533: sipush #207
    //   536: sipush #132
    //   539: ixor
    //   540: sipush #210
    //   543: sipush #153
    //   546: ixor
    //   547: iconst_m1
    //   548: ixor
    //   549: iand
    //   550: ireturn
    //   551: getstatic core/anticheat/Core.notify : Ljava/util/ArrayList;
    //   554: aload_1
    //   555: invokeinterface getName : ()Ljava/lang/String;
    //   560: invokevirtual contains : (Ljava/lang/Object;)Z
    //   563: invokestatic llIIIIlI : (I)Z
    //   566: ifeq -> 841
    //   569: getstatic core/anticheat/Core.notify : Ljava/util/ArrayList;
    //   572: aload_1
    //   573: invokeinterface getName : ()Ljava/lang/String;
    //   578: invokevirtual add : (Ljava/lang/Object;)Z
    //   581: ldc ''
    //   583: invokevirtual length : ()I
    //   586: pop2
    //   587: aload_1
    //   588: new java/lang/StringBuilder
    //   591: dup
    //   592: getstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   595: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   598: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   601: bipush #22
    //   603: iaload
    //   604: aaload
    //   605: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   608: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   611: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   614: bipush #23
    //   616: iaload
    //   617: aaload
    //   618: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   621: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   624: bipush #24
    //   626: iaload
    //   627: aaload
    //   628: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   631: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   634: invokespecial <init> : (Ljava/lang/String;)V
    //   637: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   640: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   643: bipush #25
    //   645: iaload
    //   646: aaload
    //   647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   653: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   658: ldc ''
    //   660: invokevirtual length : ()I
    //   663: pop
    //   664: bipush #25
    //   666: bipush #17
    //   668: iadd
    //   669: bipush #-81
    //   671: isub
    //   672: bipush #21
    //   674: iadd
    //   675: iconst_1
    //   676: bipush #97
    //   678: iadd
    //   679: bipush #-6
    //   681: isub
    //   682: bipush #68
    //   684: iadd
    //   685: ixor
    //   686: bipush #65
    //   688: bipush #72
    //   690: iadd
    //   691: bipush #83
    //   693: isub
    //   694: bipush #86
    //   696: iadd
    //   697: sipush #164
    //   700: bipush #21
    //   702: iadd
    //   703: sipush #146
    //   706: isub
    //   707: sipush #137
    //   710: iadd
    //   711: ixor
    //   712: ldc_w ' '
    //   715: invokevirtual length : ()I
    //   718: ineg
    //   719: ixor
    //   720: iand
    //   721: ldc_w ' '
    //   724: invokevirtual length : ()I
    //   727: if_icmple -> 841
    //   730: bipush #72
    //   732: bipush #20
    //   734: iadd
    //   735: iconst_2
    //   736: isub
    //   737: bipush #68
    //   739: iadd
    //   740: bipush #80
    //   742: bipush #123
    //   744: iadd
    //   745: bipush #107
    //   747: isub
    //   748: bipush #35
    //   750: iadd
    //   751: ixor
    //   752: bipush #127
    //   754: bipush #105
    //   756: ixor
    //   757: sipush #135
    //   760: sipush #140
    //   763: ixor
    //   764: ixor
    //   765: ldc_w ' '
    //   768: invokevirtual length : ()I
    //   771: ineg
    //   772: ixor
    //   773: iand
    //   774: ireturn
    //   775: aload_1
    //   776: getstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   779: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   782: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   785: bipush #26
    //   787: iaload
    //   788: aaload
    //   789: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   792: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   795: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   798: bipush #27
    //   800: iaload
    //   801: aaload
    //   802: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   805: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   808: bipush #28
    //   810: iaload
    //   811: aaload
    //   812: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   815: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   818: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   821: bipush #29
    //   823: iaload
    //   824: aaload
    //   825: aload #4
    //   827: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   830: iconst_0
    //   831: iaload
    //   832: aaload
    //   833: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   836: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   841: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   844: iconst_1
    //   845: iaload
    //   846: ireturn
    //   847: aload #4
    //   849: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   852: iconst_0
    //   853: iaload
    //   854: aaload
    //   855: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   858: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   861: bipush #30
    //   863: iaload
    //   864: aaload
    //   865: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   868: invokestatic llIIIIIl : (I)Z
    //   871: ifeq -> 1959
    //   874: aload_1
    //   875: new java/lang/StringBuilder
    //   878: dup
    //   879: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   882: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   885: invokespecial <init> : (Ljava/lang/String;)V
    //   888: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   891: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   894: bipush #31
    //   896: iaload
    //   897: aaload
    //   898: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   901: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   904: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   909: invokestatic llIIIIlI : (I)Z
    //   912: ifeq -> 927
    //   915: aload_1
    //   916: invokeinterface isOp : ()Z
    //   921: invokestatic llIIIIIl : (I)Z
    //   924: ifeq -> 1893
    //   927: aload #4
    //   929: arraylength
    //   930: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   933: iconst_1
    //   934: iaload
    //   935: invokestatic llIIIlIl : (II)Z
    //   938: ifeq -> 1801
    //   941: invokestatic getServer : ()Lorg/bukkit/Server;
    //   944: aload #4
    //   946: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   949: iconst_1
    //   950: iaload
    //   951: aaload
    //   952: invokeinterface getOfflinePlayer : (Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
    //   957: astore #5
    //   959: aload #5
    //   961: invokeinterface hasPlayedBefore : ()Z
    //   966: invokestatic llIIIIIl : (I)Z
    //   969: ifeq -> 1641
    //   972: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   975: new java/lang/StringBuilder
    //   978: dup
    //   979: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   982: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   985: bipush #32
    //   987: iaload
    //   988: aaload
    //   989: invokespecial <init> : (Ljava/lang/String;)V
    //   992: aload #5
    //   994: invokeinterface getName : ()Ljava/lang/String;
    //   999: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1002: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1005: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1008: bipush #33
    //   1010: iaload
    //   1011: aaload
    //   1012: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1015: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1018: invokevirtual getInt : (Ljava/lang/String;)I
    //   1021: istore #6
    //   1023: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1026: new java/lang/StringBuilder
    //   1029: dup
    //   1030: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1033: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1036: bipush #34
    //   1038: iaload
    //   1039: aaload
    //   1040: invokespecial <init> : (Ljava/lang/String;)V
    //   1043: aload #5
    //   1045: invokeinterface getName : ()Ljava/lang/String;
    //   1050: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1053: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1056: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1059: bipush #35
    //   1061: iaload
    //   1062: aaload
    //   1063: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1066: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1069: invokevirtual getInt : (Ljava/lang/String;)I
    //   1072: istore #7
    //   1074: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1077: new java/lang/StringBuilder
    //   1080: dup
    //   1081: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1084: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1087: bipush #36
    //   1089: iaload
    //   1090: aaload
    //   1091: invokespecial <init> : (Ljava/lang/String;)V
    //   1094: aload #5
    //   1096: invokeinterface getName : ()Ljava/lang/String;
    //   1101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1104: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1107: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1110: bipush #37
    //   1112: iaload
    //   1113: aaload
    //   1114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1117: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1120: invokevirtual getInt : (Ljava/lang/String;)I
    //   1123: istore #8
    //   1125: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1128: new java/lang/StringBuilder
    //   1131: dup
    //   1132: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1135: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1138: bipush #38
    //   1140: iaload
    //   1141: aaload
    //   1142: invokespecial <init> : (Ljava/lang/String;)V
    //   1145: aload #5
    //   1147: invokeinterface getName : ()Ljava/lang/String;
    //   1152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1155: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1158: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1161: bipush #39
    //   1163: iaload
    //   1164: aaload
    //   1165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1168: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1171: invokevirtual getInt : (Ljava/lang/String;)I
    //   1174: istore #9
    //   1176: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1179: new java/lang/StringBuilder
    //   1182: dup
    //   1183: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1186: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1189: bipush #40
    //   1191: iaload
    //   1192: aaload
    //   1193: invokespecial <init> : (Ljava/lang/String;)V
    //   1196: aload #5
    //   1198: invokeinterface getName : ()Ljava/lang/String;
    //   1203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1206: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1209: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1212: bipush #41
    //   1214: iaload
    //   1215: aaload
    //   1216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1219: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1222: invokevirtual getInt : (Ljava/lang/String;)I
    //   1225: istore #10
    //   1227: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1230: new java/lang/StringBuilder
    //   1233: dup
    //   1234: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1237: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1240: bipush #42
    //   1242: iaload
    //   1243: aaload
    //   1244: invokespecial <init> : (Ljava/lang/String;)V
    //   1247: aload #5
    //   1249: invokeinterface getName : ()Ljava/lang/String;
    //   1254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1257: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1260: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1263: bipush #43
    //   1265: iaload
    //   1266: aaload
    //   1267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1273: invokevirtual getInt : (Ljava/lang/String;)I
    //   1276: istore #11
    //   1278: getstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1281: new java/lang/StringBuilder
    //   1284: dup
    //   1285: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1288: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1291: bipush #44
    //   1293: iaload
    //   1294: aaload
    //   1295: invokespecial <init> : (Ljava/lang/String;)V
    //   1298: aload #5
    //   1300: invokeinterface getName : ()Ljava/lang/String;
    //   1305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1308: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1311: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1314: bipush #45
    //   1316: iaload
    //   1317: aaload
    //   1318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1321: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1324: invokevirtual getInt : (Ljava/lang/String;)I
    //   1327: istore #12
    //   1329: aload_1
    //   1330: new java/lang/StringBuilder
    //   1333: dup
    //   1334: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1337: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1340: bipush #46
    //   1342: iaload
    //   1343: aaload
    //   1344: invokespecial <init> : (Ljava/lang/String;)V
    //   1347: aload #5
    //   1349: invokeinterface getName : ()Ljava/lang/String;
    //   1354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1357: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1360: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1363: bipush #47
    //   1365: iaload
    //   1366: aaload
    //   1367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1370: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1373: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1378: aload_1
    //   1379: new java/lang/StringBuilder
    //   1382: dup
    //   1383: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1386: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1389: bipush #48
    //   1391: iaload
    //   1392: aaload
    //   1393: invokespecial <init> : (Ljava/lang/String;)V
    //   1396: iload #6
    //   1398: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1401: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1404: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1409: aload_1
    //   1410: new java/lang/StringBuilder
    //   1413: dup
    //   1414: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1417: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1420: bipush #49
    //   1422: iaload
    //   1423: aaload
    //   1424: invokespecial <init> : (Ljava/lang/String;)V
    //   1427: iload #7
    //   1429: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1432: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1435: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1440: aload_1
    //   1441: new java/lang/StringBuilder
    //   1444: dup
    //   1445: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1448: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1451: bipush #50
    //   1453: iaload
    //   1454: aaload
    //   1455: invokespecial <init> : (Ljava/lang/String;)V
    //   1458: iload #8
    //   1460: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1463: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1466: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1471: aload_1
    //   1472: new java/lang/StringBuilder
    //   1475: dup
    //   1476: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1479: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1482: bipush #51
    //   1484: iaload
    //   1485: aaload
    //   1486: invokespecial <init> : (Ljava/lang/String;)V
    //   1489: iload #10
    //   1491: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1494: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1497: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1502: aload_1
    //   1503: new java/lang/StringBuilder
    //   1506: dup
    //   1507: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1510: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1513: bipush #52
    //   1515: iaload
    //   1516: aaload
    //   1517: invokespecial <init> : (Ljava/lang/String;)V
    //   1520: iload #11
    //   1522: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1525: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1528: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1533: aload_1
    //   1534: new java/lang/StringBuilder
    //   1537: dup
    //   1538: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1541: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1544: bipush #53
    //   1546: iaload
    //   1547: aaload
    //   1548: invokespecial <init> : (Ljava/lang/String;)V
    //   1551: iload #9
    //   1553: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1556: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1559: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1564: aload_1
    //   1565: new java/lang/StringBuilder
    //   1568: dup
    //   1569: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1572: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1575: bipush #54
    //   1577: iaload
    //   1578: aaload
    //   1579: invokespecial <init> : (Ljava/lang/String;)V
    //   1582: iload #12
    //   1584: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1587: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1590: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1595: ldc ''
    //   1597: invokevirtual length : ()I
    //   1600: pop
    //   1601: aconst_null
    //   1602: ifnull -> 1959
    //   1605: sipush #251
    //   1608: sipush #167
    //   1611: ixor
    //   1612: sipush #155
    //   1615: sipush #139
    //   1618: ixor
    //   1619: ixor
    //   1620: bipush #72
    //   1622: bipush #101
    //   1624: ixor
    //   1625: bipush #51
    //   1627: bipush #82
    //   1629: ixor
    //   1630: ixor
    //   1631: ldc_w ' '
    //   1634: invokevirtual length : ()I
    //   1637: ineg
    //   1638: ixor
    //   1639: iand
    //   1640: ireturn
    //   1641: aload_1
    //   1642: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1645: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1648: bipush #55
    //   1650: iaload
    //   1651: aaload
    //   1652: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1657: ldc ''
    //   1659: invokevirtual length : ()I
    //   1662: pop
    //   1663: sipush #214
    //   1666: sipush #174
    //   1669: ixor
    //   1670: sipush #173
    //   1673: sipush #130
    //   1676: ixor
    //   1677: ixor
    //   1678: bipush #36
    //   1680: bipush #105
    //   1682: ixor
    //   1683: sipush #161
    //   1686: sipush #187
    //   1689: ixor
    //   1690: ixor
    //   1691: ldc_w ' '
    //   1694: invokevirtual length : ()I
    //   1697: ineg
    //   1698: ixor
    //   1699: iand
    //   1700: bipush #38
    //   1702: sipush #206
    //   1705: iadd
    //   1706: bipush #111
    //   1708: isub
    //   1709: bipush #120
    //   1711: iadd
    //   1712: bipush #122
    //   1714: sipush #196
    //   1717: iadd
    //   1718: sipush #148
    //   1721: isub
    //   1722: bipush #27
    //   1724: iadd
    //   1725: ixor
    //   1726: sipush #137
    //   1729: sipush #169
    //   1732: ixor
    //   1733: sipush #142
    //   1736: sipush #150
    //   1739: ixor
    //   1740: ixor
    //   1741: ldc_w ' '
    //   1744: invokevirtual length : ()I
    //   1747: ineg
    //   1748: ixor
    //   1749: iand
    //   1750: if_icmpeq -> 1959
    //   1753: bipush #51
    //   1755: iconst_3
    //   1756: ixor
    //   1757: bipush #39
    //   1759: bipush #76
    //   1761: ixor
    //   1762: ixor
    //   1763: sipush #136
    //   1766: sipush #175
    //   1769: iadd
    //   1770: sipush #182
    //   1773: isub
    //   1774: bipush #117
    //   1776: iadd
    //   1777: bipush #58
    //   1779: bipush #95
    //   1781: iadd
    //   1782: sipush #150
    //   1785: isub
    //   1786: sipush #170
    //   1789: iadd
    //   1790: ixor
    //   1791: ldc_w ' '
    //   1794: invokevirtual length : ()I
    //   1797: ineg
    //   1798: ixor
    //   1799: iand
    //   1800: ireturn
    //   1801: aload_1
    //   1802: new java/lang/StringBuilder
    //   1805: dup
    //   1806: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1809: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1812: bipush #56
    //   1814: iaload
    //   1815: aaload
    //   1816: invokespecial <init> : (Ljava/lang/String;)V
    //   1819: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   1822: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1825: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1828: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1831: bipush #57
    //   1833: iaload
    //   1834: aaload
    //   1835: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1838: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1841: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1846: ldc ''
    //   1848: invokevirtual length : ()I
    //   1851: pop
    //   1852: sipush #178
    //   1855: sipush #182
    //   1858: ixor
    //   1859: bipush #95
    //   1861: bipush #89
    //   1863: ixor
    //   1864: bipush #116
    //   1866: bipush #114
    //   1868: ixor
    //   1869: iconst_m1
    //   1870: ixor
    //   1871: iand
    //   1872: if_icmpgt -> 1959
    //   1875: sipush #194
    //   1878: sipush #149
    //   1881: ixor
    //   1882: sipush #218
    //   1885: sipush #141
    //   1888: ixor
    //   1889: iconst_m1
    //   1890: ixor
    //   1891: iand
    //   1892: ireturn
    //   1893: aload_1
    //   1894: getstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   1897: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1900: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1903: bipush #58
    //   1905: iaload
    //   1906: aaload
    //   1907: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1910: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1913: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1916: bipush #59
    //   1918: iaload
    //   1919: aaload
    //   1920: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1923: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1926: bipush #60
    //   1928: iaload
    //   1929: aaload
    //   1930: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1933: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1936: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1939: bipush #61
    //   1941: iaload
    //   1942: aaload
    //   1943: aload #4
    //   1945: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1948: iconst_0
    //   1949: iaload
    //   1950: aaload
    //   1951: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1954: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1959: aload #4
    //   1961: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1964: iconst_0
    //   1965: iaload
    //   1966: aaload
    //   1967: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   1970: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   1973: bipush #62
    //   1975: iaload
    //   1976: aaload
    //   1977: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1980: invokestatic llIIIIIl : (I)Z
    //   1983: ifeq -> 2276
    //   1986: aload_1
    //   1987: new java/lang/StringBuilder
    //   1990: dup
    //   1991: getstatic core/anticheat/util/Settings.NAME : Ljava/lang/String;
    //   1994: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1997: invokespecial <init> : (Ljava/lang/String;)V
    //   2000: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2003: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2006: bipush #63
    //   2008: iaload
    //   2009: aaload
    //   2010: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2013: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2016: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   2021: invokestatic llIIIIlI : (I)Z
    //   2024: ifeq -> 2039
    //   2027: aload_1
    //   2028: invokeinterface isOp : ()Z
    //   2033: invokestatic llIIIIIl : (I)Z
    //   2036: ifeq -> 2204
    //   2039: new java/io/File
    //   2042: dup
    //   2043: getstatic core/anticheat/commands/Anticheat.plugin : Lcore/anticheat/Core;
    //   2046: invokevirtual getDataFolder : ()Ljava/io/File;
    //   2049: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2052: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2055: bipush #64
    //   2057: iaload
    //   2058: aaload
    //   2059: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   2062: astore #5
    //   2064: new java/io/File
    //   2067: dup
    //   2068: getstatic core/anticheat/commands/Anticheat.plugin : Lcore/anticheat/Core;
    //   2071: invokevirtual getDataFolder : ()Ljava/io/File;
    //   2074: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2077: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2080: bipush #65
    //   2082: iaload
    //   2083: aaload
    //   2084: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   2087: astore #6
    //   2089: aload #5
    //   2091: invokestatic loadConfiguration : (Ljava/io/File;)Lorg/bukkit/configuration/file/YamlConfiguration;
    //   2094: putstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   2097: aload #6
    //   2099: invokestatic loadConfiguration : (Ljava/io/File;)Lorg/bukkit/configuration/file/YamlConfiguration;
    //   2102: putstatic core/anticheat/api/onEnable.playerData : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   2105: aload_1
    //   2106: new java/lang/StringBuilder
    //   2109: dup
    //   2110: getstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   2113: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2116: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2119: bipush #66
    //   2121: iaload
    //   2122: aaload
    //   2123: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   2126: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2129: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2132: bipush #67
    //   2134: iaload
    //   2135: aaload
    //   2136: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2139: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2142: bipush #68
    //   2144: iaload
    //   2145: aaload
    //   2146: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2149: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2152: invokespecial <init> : (Ljava/lang/String;)V
    //   2155: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2158: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2161: bipush #69
    //   2163: iaload
    //   2164: aaload
    //   2165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2168: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2171: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   2176: ldc ''
    //   2178: invokevirtual length : ()I
    //   2181: pop
    //   2182: bipush #115
    //   2184: bipush #119
    //   2186: ixor
    //   2187: ifge -> 2270
    //   2190: bipush #125
    //   2192: bipush #42
    //   2194: ixor
    //   2195: bipush #114
    //   2197: bipush #37
    //   2199: ixor
    //   2200: iconst_m1
    //   2201: ixor
    //   2202: iand
    //   2203: ireturn
    //   2204: aload_1
    //   2205: getstatic core/anticheat/api/onEnable.config : Lorg/bukkit/configuration/file/YamlConfiguration;
    //   2208: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2211: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2214: bipush #70
    //   2216: iaload
    //   2217: aaload
    //   2218: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   2221: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2224: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2227: bipush #71
    //   2229: iaload
    //   2230: aaload
    //   2231: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2234: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2237: bipush #72
    //   2239: iaload
    //   2240: aaload
    //   2241: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2244: getstatic core/anticheat/commands/Anticheat.llIlII : [Ljava/lang/String;
    //   2247: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2250: bipush #73
    //   2252: iaload
    //   2253: aaload
    //   2254: aload #4
    //   2256: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2259: iconst_0
    //   2260: iaload
    //   2261: aaload
    //   2262: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2265: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   2270: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2273: iconst_1
    //   2274: iaload
    //   2275: ireturn
    //   2276: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2279: iconst_0
    //   2280: iaload
    //   2281: ireturn
    //   2282: getstatic core/anticheat/commands/Anticheat.lIIlllI : [I
    //   2285: iconst_0
    //   2286: iaload
    //   2287: ireturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   959	698	5	lllIllllIIllllI	Lorg/bukkit/OfflinePlayer;
    //   0	2288	5	lllIllllIIlIIIl	S
    //   0	2288	10	lllIllllIIIllII	Ljava/lang/String;
    //   0	2288	2	lllIllllIIlIIll	F
    //   0	2288	12	lllIllllIIIlIlI	J
    //   1176	419	9	lllIllllIIllIlI	I
    //   1125	470	8	lllIllllIIllIll	I
    //   0	2288	3	lllIllllIlIIIII	Ljava/lang/String;
    //   0	2288	4	lllIllllIIlllll	[Ljava/lang/String;
    //   1074	521	7	lllIllllIIlllII	I
    //   0	2288	4	lllIllllIIlIIlI	I
    //   0	2288	7	lllIllllIIIllll	S
    //   0	2288	9	lllIllllIIIllIl	Ljava/lang/String;
    //   0	2288	0	lllIllllIlIIIll	Lcore/anticheat/commands/Anticheat;
    //   0	2288	6	lllIllllIIlIIII	Z
    //   0	2288	1	lllIllllIIlIlII	I
    //   2089	87	6	lllIllllIIlIlIl	Ljava/io/File;
    //   1227	368	10	lllIllllIIllIIl	I
    //   0	2288	11	lllIllllIIIlIll	B
    //   1278	317	11	lllIllllIIllIII	I
    //   2064	112	5	lllIllllIIlIllI	Ljava/io/File;
    //   0	2288	1	lllIllllIlIIIlI	Lorg/bukkit/command/CommandSender;
    //   1329	266	12	lllIllllIIlIlll	I
    //   0	2288	8	lllIllllIIIlllI	S
    //   0	2288	2	lllIllllIlIIIIl	Lorg/bukkit/command/Command;
    //   1023	572	6	lllIllllIIlllIl	I
  }
  
  private static boolean llIIIIlI(double lllIlllIlIIllII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
  
  static {
    llIIIIII();
    lIllIIll();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\commands\Anticheat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */