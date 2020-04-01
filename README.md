# jvm的学习

1.VisualVM工具的使用
1.1简介：VisualVM，能够监控线程，内存情况，查看方法的CPU时间和内存中的对 象，已被GC的对象，反向查看分配的堆栈(如100个String对象分别由哪几个对象分配出来的)。 
     VisualVM使用简单，几乎0配置，功能还是比较丰富的，几乎囊括了其它JDK自带命令的所有功能。
1.2启动：在jdk的安装目录的bin目录下，找到jvisualvm.exe，双击打开即可

1.3VisualJVM不仅是可以监控本地jvm进程，还可以监控远程的jvm进程，需要借助于JMX技术实现。

JMX(Java Management Extensions，即Java管理扩展)是一个为应用程序、设备、系 统等植入管理功能的框架。
JMX可以跨越一系列异构操作系统平台、系统体系结构和网络 传输协议，灵活的开发无缝集成的系统、网络和服务管理应用。

监控远程tomcat
#在tomcat的bin目录下，修改catalina.sh，添加如下的参数
JAVA_OPTS="‐Dcom.sun.management.jmxremote -Djava.rmi.server.hostname=172.16.81.133 ‐Dcom.sun.management.jmxremote.port=9999 ‐Dcom.sun.management.jmxremote.authenticate=false ‐Dcom.sun.management.jmxremote.ssl=false"
#这几个参数的意思是:
#‐Dcom.sun.management.jmxremote :允许使用JMX远程管理 
#‐Dcom.sun.management.jmxremote.port=9999 :JMX远程连接端口 
#‐Dcom.sun.management.jmxremote.authenticate=false :不进行身份认证，任何用 户都可以连接
#‐Dcom.sun.management.jmxremote.ssl=false :不使用ssl
#-Djava.rmi.server.hostname=172.16.81.133 远程主机名
