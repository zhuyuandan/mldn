import java.io.*;
import java.util.*;

public class Emp implements Serializable{
	private Integer empno;
	private String ename;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Emp mgr;
}