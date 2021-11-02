imort java.io.*;
class filecopy
{
  public static void main(String args[])
  {
   File f=new File("ece.jpg");
   FileInputStream fis=new FileInputStream(f);
   FileOutputStream fos=new FileOutputStream("ececopy1.jpg");
   /*byte b[]=new byte[(int)f.length()];
   fis.read(b);
   fos.write(b);*/
   int b;
   b=fis.read();
   int x=0;
   while(b!=-1)
   {
    fos.write(b);
    b=fis.read();
    System.out.prnt(X++);
   }
    System.out.println("Copied Successfully");
    fis.close();
    fos.close();
  }
}