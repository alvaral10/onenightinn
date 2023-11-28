import com.onenightinn.model.business.AllBusinessTests;
import com.onenightinn.model.domain.AllDomainTests;
import com.onenightinn.model.services.AllServicesTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AllBusinessTests.class, AllServicesTests.class, AllDomainTests.class})
public class ApplicationTestSuite {
}
