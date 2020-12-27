import java.awt.*; 
class frame{  
    public static void main(String args[]){  
        Frame f= new Frame("TextField Example");  
        TextField t1;  
        t1=new TextField(" Welcome to textfield ");  
        t1.setBounds(100,200, 200,30);  
        f.add(t1); 
        TextArea area=new TextArea("Welcome to textarea");  
        area.setBounds(100,100, 300,50);  
        f.add(area); 
        Button b=new Button("Click Here");  
        b.setBounds(150,250,80,30);  
        f.add(b);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
             
    }  
}  
