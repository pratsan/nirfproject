/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_and_login;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.converters.CSVLoader;
/**
 *
 * @author Aman
 */
public class register_setter_getter {
     String clg,password,email;
     float tlr,rpc,go,oi,pr;
     int rank;
    public void setclg(String clg)
    {
        this.clg=clg;
    }
    public void setpass(String password)
    {
        this.password=password;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public void settlr(float tlr)
    {
        this.tlr=tlr;
    }
   
      public void setrpc(float rpc)
    {
        this.rpc=rpc;
    }
       public void setgo(float go)
    {
        this.go=go;
    }
        public void setoi(float oi)
    {
        this.oi=oi;
    }
         public void setpr(float pr)
    {
        this.pr=pr;
    }
         public void setrank(int rank)
         {
             this.rank=rank;
         }
         
    public String getclg()
    {
        return clg;
    }
    public String getpass()
    {
        return password;
    }
    public String getemail()
    {
        return email;
    }
    public float gettlr()
    {
        return tlr;
    }
    public float getrpc()
    {
        return rpc;
    }
    public float getgo()
    {
        return go;
    }
    public float getoi()
    {
        return oi;
    }
    public float getpr()
    {
        return pr;
    }
    public int getrank()
    {
        return rank;
    }
    public int register() throws SQLException
    {
        int n;
        PreparedStatement ps=connect_to_sql.Connect_db.getConnection().prepareStatement("insert into login(name,email,password) values(?,?,?)");
        ps.setString(1, getclg());
        ps.setString(2, getemail());
        ps.setString(3, getpass());
        n=ps.executeUpdate();
        return n;
    }
    public int login() throws SQLException
    {
        int flag=0; 
 
PreparedStatement ps=connect_to_sql.Connect_db.getConnection().prepareStatement("select name,email,password from login where email=? and password=?");
ps.setString(1,getemail());
ps.setString(2, getpass());
      ResultSet rs=ps.executeQuery();
  
      while(rs.next())
      {
      //    System.out.println(rs.getString("password"));
          String str=rs.getString("password");
          if(str.equals(getpass()))
          {
              setclg(rs.getString("name"));
              flag=1;
          }
      }
      
                return flag;
    }
    
    public int rank(double total) throws Exception
    {
        if(total>=434.29)
        {
            return 1;
        }
        else if(total>=409.34 && total<434.29)
        {
            return 2;
        }
        else
        {
        DataSource source=new DataSource("E:\\NIRF-Project\\traing_test/train.arff");
        Instances dataset=source.getDataSet();
        dataset.setClassIndex(dataset.numAttributes()-1);
        MultilayerPerceptron ms=new MultilayerPerceptron();
                ms.buildClassifier(dataset);
                ms.setLearningRate(0.3);
              
              
               CSVLoader loader=new CSVLoader();
               loader.setSource(new File("E:\\NIRF-Project\\traing_test/test.csv"));
               Instances dataset1=loader.getDataSet();
                dataset1.setClassIndex(dataset.numAttributes()-1);
               double n= ms.classifyInstance(dataset1.firstInstance());
               System.out.println(dataset1.firstInstance());
               int ra=(int)n;
        
        return ra;
    }
    }
    public void value() throws SQLException
    {
     PreparedStatement ps=connect_to_sql.Connect_db.getConnection().prepareStatement("select * from parameter_values where rank=?");
     ps.setInt(1, rank);
     ResultSet rs=ps.executeQuery();
     while(rs.next())
     {
         settlr(rs.getFloat("p1"));
         setrpc(rs.getFloat("p2"));
         setgo(rs.getFloat("p3"));
         setoi(rs.getFloat("p4"));
         setpr(rs.getFloat("p5"));
     }
    }
   
    public void csv(String tlr,String rpc,String go,String oi,String pr,double total) throws IOException
    {
     File file = new File("E:\\NIRF-Project\\traing_test/test.csv"); 
  
     // create FileWriter object with file as parameter
     FileWriter outputfile = new FileWriter(file);
     // create CSVWriter object filewriter object as parameter
     CSVWriter writer = new CSVWriter(outputfile);
     // adding header to csv
     String[] header = { "P1", "P2", "P3","P4","P5","total","rank" };
     writer.writeNext(header);
     // add data to csv
     String[] data1 = { tlr,rpc,go,oi,pr,String.valueOf(total),"?"};
     writer.writeNext(data1);
     file.createNewFile();
     // closing writer connection
     writer.close();    
    
    }
    public static void main(String[] args) throws SQLException, Exception {
//       register_setter_getter re=new register_setter_getter();
//       //re.value();
//        int n=re.rank();
//        System.out.println("the rank is"+n);
    }
    }
    
    

