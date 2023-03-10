package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

// calistirmak istegim feature file belirtiyorum
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },

         features = "src/test/resources", // ZORUNLU ==>Feature dosyanin pathini girmemiz lazim
         glue = "stepdefinitions",  //ZORUNLU =>stepdefinitions adresi(path)i
         tags = "@data",   // hangi feature file kosmali onu belirtiyoruz =>Eger tags kullanmaz isek Runner tum feature run eder
         dryRun = false  //opsiyoneldir
)
        public class Runner {
}
/*
Runner : feature file'lari calistirmak icin kullanilir
@RunWith: Cucumber.class'lari calistirmak icin kullanilir, kullanmadan Runne calismaz
@CucumberOptions(): feature path'i eklemek icin kullanilir, step deginiton path, tags, dryRun, report plugins icerir
-feature  : feature dosyasi path'ini verir, spesifik bir feature file isaret edilebilir
-glue  :  step defition class'inda spesifik path'i isaret eder
-tags  : hangi feature ya da senaryo kosacak bunu belirler. Bu tag'i feature file ekliyoruz
-dryRun : herhangi bir JAVA code eksikligini kontrol eder (step defition kullaniriz)
        :dryRun 2 value (deger) alir, true(head-less) veya false
        :dryRun = false =>Herhangi bir JAVA kodunun eksik olup olmadigini kontrol ederken tarayicida testleri calistirir
        :dryRun = true =>Herhangi bir JAVA kodunun eksik olup olmadigini kontrol ederken tarayici olmadan testleri calistirir

 */