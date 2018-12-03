open module com.example {

    requires java.xml.bind;
    requires java.annotation;
    requires java.activation;
    requires com.sun.xml.bind;
    requires com.sun.xml.txw2;
    requires com.sun.istack.runtime;
    requires org.jvnet.staxex;
    requires com.sun.xml.fastinfoset;

    exports com.example to java.xml.bind;
}