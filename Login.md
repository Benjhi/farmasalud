# farmasalud

   
        int resultado=0;
        
        try {
     
            String usuario=txtusuario.getText();
            String pass=String.valueOf(txtpass.getPassword());
            
            String sql="SELECT * FROM usuario WHERE Usuario='" +usuario+ "' and Contraseña='" +pass+ "' ";
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next()){
                
                resultado=1;
                
                if(resultado==1){
                    
                    MenuPrincipal form=new MenuPrincipal();
                    form.setVisible(true);
                    this.dispose();
                }else{
                    
                    JOptionPane.showMessageDialog(null,"Datos invalidos");
                }
        
            }catch (Exception e){
            
                    JOptionPane.showMessageDialog(null,"Datos invalidos" + e.getmessage());
        
    } 
        }
