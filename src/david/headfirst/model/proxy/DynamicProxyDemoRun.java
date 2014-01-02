package david.headfirst.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyDemoRun {
	/*
	 * 拥有者javabean代理
	 */
	private static IPersonBean getOwnerProxy(IPersonBean personBean) {
		return (IPersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass()
				.getInterfaces(), new OwnerInvocationHandler(personBean));
	}

	/*
	 * 非拥有者javabean代理
	 */
	private static IPersonBean getNotOwnerProxy(IPersonBean personBean) {
		return (IPersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass()
				.getInterfaces(), new NotOwnerInvocationHandler(personBean));
	}

	private static void getProxy(InvocationHandler handler) {
		if (handler.getClass().getName().contains("OwnerInvocationHandler")) {
			getOwnerProxy();
		} else if (handler.getClass().getName().contains("NotOwnerInvocationHandler")) {
			getNotOwnerProxy();
		}
	}

	public static void getProxy(boolean isOwner) {
		if (isOwner)
			getOwnerProxy();
		else
			getNotOwnerProxy();
	}

	public static void getOwnerProxy() {
		try {
			IPersonBean personBean = new PersonBeanImp("daviddai", "male", "travel,computer,game,talk");
			personBean.setHotOrNotRating(100);
			IPersonBean personBeanImp = getOwnerProxy(personBean);
			System.out.println(personBeanImp.getName());
			System.out.println(personBeanImp.getGender());
			System.out.println(personBeanImp.getInterests());
			System.out.println(personBeanImp.getHotOrNotRating());
			personBeanImp.setHotOrNotRating(200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void getNotOwnerProxy() {
		try {
			IPersonBean personBean = new PersonBeanImp("notdaviddai", "notmale",
					"nottravel,notcomputer,notgame,nottalk");			
			personBean.setHotOrNotRating(100);
			IPersonBean personBeanImp = getNotOwnerProxy(personBean);
//			System.out.println(Proxy.isProxyClass(personBeanImp.getClass()));/
			System.out.println(personBeanImp.getName());
			System.out.println(personBeanImp.getGender());
			System.out.println(personBeanImp.getInterests());
			System.out.println(personBeanImp.getHotOrNotRating());
			personBeanImp.setHotOrNotRating(200);
			System.out.println(personBeanImp.getHotOrNotRating());
			personBeanImp.setName("modify" + personBeanImp.getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
