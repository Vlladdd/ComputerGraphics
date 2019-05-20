package lab4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import lab4.Swing;
import com.sun.j3d.loaders.*;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.loaders.Scene; // Contains the object loaded from disk.
import com.sun.j3d.loaders.objectfile.ObjectFile; // Loader of .obj models
import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.*;
import javax.swing.Timer;
import javax.vecmath.*;


public class ComplexObject implements ActionListener {

    private TransformGroup SwingTransformGroup;
    private Transform3D SwingTransform3D = new Transform3D();
    private BranchGroup objRoot;
    private Timer timer;
    private float angle = 0;

    public static void main(String[] args) {
        new ComplexObject();
    }

    public ComplexObject() {
        timer = new Timer(50, this);
        timer.start();
        BranchGroup scene = createSceneGraph();
        SimpleUniverse u = new SimpleUniverse();
        u.getViewingPlatform().setNominalViewingTransform();
        u.addBranchGraph(scene);
    }

    private BranchGroup createSceneGraph() {

        objRoot = new BranchGroup();

        SwingTransformGroup = new TransformGroup();
        SwingTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        buildSwing();
        objRoot.addChild(SwingTransformGroup);

        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),100.0);
        Color3f light1Color = new Color3f(1.0f, 0.5f, 0.4f);
        Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
        DirectionalLight light1 = new DirectionalLight(light1Color,	light1Direction);
        light1.setInfluencingBounds(bounds);
        objRoot.addChild(light1);

        Color3f ambientColor = new Color3f(1.0f, 1.0f, 1.0f);
        AmbientLight ambientLightNode = new AmbientLight(ambientColor);
        ambientLightNode.setInfluencingBounds(bounds);
        objRoot.addChild(ambientLightNode);
        return objRoot;
    }

    public static Scene getSceneFromFile(String location) throws IOException {
        ObjectFile file = new ObjectFile(ObjectFile.RESIZE);
        return file.load(new FileReader(location));
    }

    private void buildSwing() {
      //create platform
    	
      //left support 1
      TransformGroup tgLeft1 = new TransformGroup();
      Transform3D transformLeft1 = new Transform3D();
      Box BoxLeft1 = Swing.getBox(0.01f, 0.4f,0.01f);
      Vector3f vectorLeft1 = new Vector3f(0.4f, .0f, .0f);
      transformLeft1.setTranslation(vectorLeft1);
      transformLeft1.setRotation(new AxisAngle4d(1, 0, 0, 0.5));
      tgLeft1.setTransform(transformLeft1);
      tgLeft1.addChild(BoxLeft1);
      SwingTransformGroup.addChild(tgLeft1);
      
      //left support 2
      TransformGroup tgLeft2 = new TransformGroup();
      Transform3D transformLeft2 = new Transform3D();
      Box BoxLeft2 = Swing.getBox(0.01f, 0.4f,0.01f);
      Vector3f vectorLeft2 = new Vector3f(0.4f, .0f, 0.4f);
      transformLeft2.setTranslation(vectorLeft2);
      transformLeft2.setRotation(new AxisAngle4d(1, 0, 0, -0.5));
      tgLeft2.setTransform(transformLeft2);
      tgLeft2.addChild(BoxLeft2);
      SwingTransformGroup.addChild(tgLeft2);
      
      //left support 3
      TransformGroup tgLeft3 = new TransformGroup();
      Transform3D transformLeft3 = new Transform3D();
      Box BoxLeft3 = Swing.getBox(0.01f, 0.2f,0.01f);
      Vector3f vectorLeft3 = new Vector3f(0.4f, .0f, 0.2f);
      transformLeft3.setTranslation(vectorLeft3);
      transformLeft3.setRotation(new AxisAngle4d(1, 0, 0, 1.5708));
      tgLeft3.setTransform(transformLeft3);
      tgLeft3.addChild(BoxLeft3);
      SwingTransformGroup.addChild(tgLeft3);
      
      //right support 1
      TransformGroup tgRight1 = new TransformGroup();
      Transform3D transformRight1 = new Transform3D();
      Box BoxRight1 = Swing.getBox(0.01f, 0.4f,0.01f);
      Vector3f vectorRight1 = new Vector3f(-0.4f, .0f, .0f);
      transformRight1.setTranslation(vectorRight1);
      transformRight1.setRotation(new AxisAngle4d(1, 0, 0, 0.5));
      tgRight1.setTransform(transformRight1);
      tgRight1.addChild(BoxRight1);
      SwingTransformGroup.addChild(tgRight1);
      
      //right support 2
      TransformGroup tgRight2 = new TransformGroup();
      Transform3D transformRight2 = new Transform3D();
      Box BoxRight2 = Swing.getBox(0.01f, 0.4f,0.01f);
      Vector3f vectorRight2 = new Vector3f(-0.4f, .0f, 0.4f);
      transformRight2.setTranslation(vectorRight2);
      transformRight2.setRotation(new AxisAngle4d(1, 0, 0, -0.5));
      tgRight2.setTransform(transformRight2);
      tgRight2.addChild(BoxRight2);
      SwingTransformGroup.addChild(tgRight2);
      
      //right support 3
      TransformGroup tgRight3 = new TransformGroup();
      Transform3D transformRight3 = new Transform3D();
      Box BoxRight3 = Swing.getBox(0.01f, 0.2f,0.01f);
      Vector3f vectorRight3 = new Vector3f(-0.4f, .0f, 0.2f);
      transformRight3.setTranslation(vectorRight3);
      transformRight3.setRotation(new AxisAngle4d(1, 0, 0, 1.5708));
      tgRight3.setTransform(transformRight3);
      tgRight3.addChild(BoxRight3);
      SwingTransformGroup.addChild(tgRight3);
      
      //top support
      TransformGroup tgTop = new TransformGroup();
      Transform3D transformTop = new Transform3D();
      Box BoxTop = Swing.getBox(0.6f, 0.01f,0.01f);
      Vector3f vectorTop = new Vector3f(.0f, 0.35f, 0.2f);
      transformTop.setTranslation(vectorTop);
      tgTop.setTransform(transformTop);
      tgTop.addChild(BoxTop);
      SwingTransformGroup.addChild(tgTop);

        //create swing
        TransformGroup tG_swing = new TransformGroup();
        Transform3D t_swing = new Transform3D();
        Scene display = null;
        try
        {
            display = getSceneFromFile("resources/models/Seat_4.obj");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Vector3d vectorTop2 = new Vector3d(0.0, 0.15f, 0.16f);
        t_swing.setTranslation(vectorTop2);
        t_swing.setRotation(new AxisAngle4d(0, 1, 0, 1.5708));
        t_swing.setScale(0.2);

        SwingTransformGroup.setTransform(SwingTransform3D);
        tG_swing.setTransform(t_swing);
        try{
        	tG_swing.addChild(display.getSceneGroup());
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }

        SwingTransformGroup.addChild(tG_swing);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	SwingTransform3D.rotY(angle);
        SwingTransformGroup.setTransform(SwingTransform3D);
        angle += 0.02;
    }

}