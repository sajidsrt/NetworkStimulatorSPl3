package GraphTest;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphGenerator extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu start;
    private JMenuItem jMenuItem_rapidnetApplications;
    private JMenuItem jMenuItem_packetTracer;

    private JButton button_rapidnet_log_file;
    private JButton button_rapidnet_NDlog_file;
    private JButton button_generate_rapidnet_graph;

    JFileChooser fileChooser = new JFileChooser();
    StringBuilder fileString = new StringBuilder();



    GraphGenerator(){
        setLayout(new FlowLayout());
        this.setSize(500,500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        menubar= new JMenuBar();
        start= new JMenu("Start");

        jMenuItem_rapidnetApplications= new JMenuItem("RapidnetApplications");
        jMenuItem_rapidnetApplications.addActionListener(this);
        jMenuItem_packetTracer= new JMenuItem("Packet Tracer");

        start.add(jMenuItem_rapidnetApplications);
        start.add(jMenuItem_packetTracer);

        menubar.add(start);

        this.setJMenuBar(menubar);


    }

    private JPanel getInitialPanel(){
        JPanel panel= new JPanel();
        return panel;
    }

    private void changePanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel, new FlowLayout());
        getContentPane().doLayout();
        update(getGraphics());
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button_rapidnet_log_file){
            if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){

                //get the file
                java.io.File file = fileChooser.getSelectedFile();

                //create a scanner for the file
                button_rapidnet_log_file.setText(file.getAbsolutePath());
                update(getGraphics());
            }
        }

        if(actionEvent.getSource() == jMenuItem_rapidnetApplications) {

            changePanel(getRapidnetApplicationPanel());
           // this.paint(null);

        }

        if(actionEvent.getSource() == button_generate_rapidnet_graph) {

            getGraph();
            repaint();
            // this.paint(null);

        }
    }

    public void getGraph(){
        setVisible(true);
/*
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try
        {
            Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 10,
                    10);
            //x,y,width,height

            Object v2 = graph.insertVertex(parent, null, "World!", 240, 150,
                    80, 30);
            graph.insertEdge(parent, null, "Edge", v1, v2);
        }
        finally
        {
            graph.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);*/
       // return  new GraphPanel();
    }

    private JPanel getRapidnetApplicationPanel(){
        JPanel panel= new JPanel();
        button_rapidnet_log_file= new JButton("Upload Log file");
        button_rapidnet_NDlog_file= new JButton("NDLog file");
        button_generate_rapidnet_graph= new JButton("Generate Graph");
        button_rapidnet_log_file.addActionListener(this);
        button_generate_rapidnet_graph.addActionListener(this);
        panel.add(button_rapidnet_log_file);
        panel.add(button_rapidnet_NDlog_file);
        panel.add(button_generate_rapidnet_graph);
        return panel;
    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                GraphGenerator gui= new GraphGenerator();
                gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui.setVisible(true);
                gui.setTitle("Initial");
            }
        });

    }



}
