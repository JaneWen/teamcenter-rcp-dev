package vip.teamcenter.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleHandlerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// 用于执行单元测试前，初始化数据。整个类只执行一次，
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// 用于执行单元测试后，清理数据。整个类只执行一次，
	}

	@Before
	public void setUp() throws Exception {
		// 用于执行单元测试前，初始化数据。每执行一次@Test，都会执行
	}

	@After
	public void tearDown() throws Exception {
		// 用于执行单元测试后，清理数据。每执行一次@Test，都会执行
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
