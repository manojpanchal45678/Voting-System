package projectclasses;
public class Loading implements Runnable {
    
        public void Load()
        {
            try
            {
                Thread.sleep(10000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
                
        }  

    @Override
    public void run() {
        Load();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
