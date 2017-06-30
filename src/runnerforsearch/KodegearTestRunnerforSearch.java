package runnerforsearch;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="featureforsearch",glue={"stepDefinationforsearch"})
public class KodegearTestRunnerforSearch {

}
