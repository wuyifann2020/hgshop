import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageInfo;
import com.wuyifan.hgshop.pojo.Brand;
import com.wuyifan.hgshop.pojo.Spec;
import com.wuyifan.hgshop.service.BrankService;
import com.wuyifan.hgshop.service.SpecService;
@ContextConfiguration({"classpath:dubbo-provider.xml",
"classpath:dao.xml"})
@RunWith(SpringRunner.class)
public class BrandTest {
	@Autowired
	BrankService service;
	
	@Autowired
	SpecService service1;

	/*
	 * @Test public void test() { Brand brand = service.find(2);
	 * System.out.println("brand is " + brand); }
	 */

	@Test
	public void testList() {
		PageInfo<Spec> pageInfo = service1.list(1, 3, new Spec());
		pageInfo.getList().forEach(x->{System.out.println("x is " + x);});
		
	}
	
}
