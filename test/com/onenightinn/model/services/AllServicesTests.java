package com.onenightinn.model.services;


import com.onenightinn.model.services.factory.ServiceFactoryTest;
import com.onenightinn.model.services.loginservice.LoginServiceImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ServiceFactoryTest.class, LoginServiceImplTest.class })
public class AllServicesTests {
}
