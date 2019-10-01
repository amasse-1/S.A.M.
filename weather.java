package chatbot;
/* Made in weka
 *
*/
public class weather {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = weather.N289596c818(i);
    return p;
  }
  static double N289596c818(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (i[0].equals("sunny")) {
    p = weather.N5e55ae5719(i);
    } else if (i[0].equals("rainy")) {
    p = weather.N2be04c922(i);
    } else if (i[0].equals("windy")) {
    p = weather.N2148038a25(i);
    } else if (i[0].equals("nice")) {
    p = weather.N194e8ad328(i);
    } else if (i[0].equals("cool")) {
    p = weather.N78045a4931(i);
    } else if (i[0].equals("warm")) {
    p = weather.N22869cd034(i);
    } else if (i[0].equals("cloudy")) {
    p = weather.N2c00d7e437(i);
    } else if (i[0].equals("snowy")) {
    p = weather.N3183784b40(i);
    } 
    return p;
  }
  static double N5e55ae5719(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (i[1].equals("no")) {
    p = weather.N2b965ea920(i);
    } else if (i[1].equals("yes")) {
    p = weather.N699e10421(i);
    } 
    return p;
  }
  static double N2b965ea920(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals("yes")) {
      p = 0;
    } else if (i[2].equals("no")) {
      p = 1;
    } 
    return p;
  }
  static double N699e10421(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 24;
    } else if (i[2].equals("yes")) {
      p = 24;
    } else if (i[2].equals("no")) {
      p = 2;
    } 
    return p;
  }
  static double N2be04c922(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 7;
    } else if (i[1].equals("no")) {
    p = weather.N71ea25df23(i);
    } else if (i[1].equals("yes")) {
    p = weather.N68904e5d24(i);
    } 
    return p;
  }
  static double N71ea25df23(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 25;
    } else if (i[2].equals("yes")) {
      p = 25;
    } else if (i[2].equals("no")) {
      p = 7;
    } 
    return p;
  }
  static double N68904e5d24(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (i[2].equals("yes")) {
      p = 3;
    } else if (i[2].equals("no")) {
      p = 5;
    } 
    return p;
  }
  static double N2148038a25(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (i[1].equals("no")) {
    p = weather.N53a2c32626(i);
    } else if (i[1].equals("yes")) {
    p = weather.N73c6c05027(i);
    } 
    return p;
  }
  static double N53a2c32626(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (i[2].equals("yes")) {
      p = 4;
    } else if (i[2].equals("no")) {
      p = 6;
    } 
    return p;
  }
  static double N73c6c05027(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 26;
    } else if (i[2].equals("yes")) {
      p = 26;
    } else if (i[2].equals("no")) {
      p = 17;
    } 
    return p;
  }
  static double N194e8ad328(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 8;
    } else if (i[1].equals("no")) {
    p = weather.N78fb8e2329(i);
    } else if (i[1].equals("yes")) {
    p = weather.N3d85d9e930(i);
    } 
    return p;
  }
  static double N78fb8e2329(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 11;
    } else if (i[2].equals("yes")) {
      p = 11;
    } else if (i[2].equals("no")) {
      p = 8;
    } 
    return p;
  }
  static double N3d85d9e930(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 10;
    } else if (i[2].equals("yes")) {
      p = 10;
    } else if (i[2].equals("no")) {
      p = 18;
    } 
    return p;
  }
  static double N78045a4931(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 19;
    } else if (i[1].equals("no")) {
    p = weather.N15715f8832(i);
    } else if (i[1].equals("yes")) {
    p = weather.N31df419333(i);
    } 
    return p;
  }
  static double N15715f8832(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 19;
    } else if (i[2].equals("yes")) {
      p = 19;
    } else if (i[2].equals("no")) {
      p = 22;
    } 
    return p;
  }
  static double N31df419333(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 15;
    } else if (i[2].equals("yes")) {
      p = 15;
    } else if (i[2].equals("no")) {
      p = 9;
    } 
    return p;
  }
  static double N22869cd034(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 12;
    } else if (i[1].equals("no")) {
    p = weather.N780a5cdb35(i);
    } else if (i[1].equals("yes")) {
    p = weather.N6718c14d36(i);
    } 
    return p;
  }
  static double N780a5cdb35(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 16;
    } else if (i[2].equals("yes")) {
      p = 16;
    } else if (i[2].equals("no")) {
      p = 12;
    } 
    return p;
  }
  static double N6718c14d36(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 27;
    } else if (i[2].equals("yes")) {
      p = 27;
    } else if (i[2].equals("no")) {
      p = 20;
    } 
    return p;
  }
  static double N2c00d7e437(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 14;
    } else if (i[1].equals("no")) {
    p = weather.N3a76aea838(i);
    } else if (i[1].equals("yes")) {
    p = weather.N10b0c1b939(i);
    } 
    return p;
  }
  static double N3a76aea838(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 14;
    } else if (i[2].equals("yes")) {
      p = 14;
    } else if (i[2].equals("no")) {
      p = 23;
    } 
    return p;
  }
  static double N10b0c1b939(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 13;
    } else if (i[2].equals("yes")) {
      p = 13;
    } else if (i[2].equals("no")) {
      p = 21;
    } 
    return p;
  }
  static double N3183784b40(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 28;
    } else if (i[1].equals("no")) {
    p = weather.N1b16366841(i);
    } else if (i[1].equals("yes")) {
    p = weather.N149ad84c42(i);
    } 
    return p;
  }
  static double N1b16366841(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 30;
    } else if (i[2].equals("yes")) {
      p = 30;
    } else if (i[2].equals("no")) {
      p = 28;
    } 
    return p;
  }
  static double N149ad84c42(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 31;
    } else if (i[2].equals("yes")) {
      p = 31;
    } else if (i[2].equals("no")) {
      p = 29;
    } 
    return p;
  }
}
