package com.juvenxu.mvnbook.template.method;

public abstract class AbstractBuild
{
    /**
     * 抽象生命周期
     *
     * mvn clean : clean生命周期的clean阶段。执行clean生命周期的pre-clean和clean阶段
     * mvn test：该命令调用default生命周期的test阶段。实际执行的阶段为default生命周期的validate、initialize等。直到test的所有阶段，这解释了为什么在执行测试的时候，项目代码能够自动编译。
     * mvn clean install: clean生命周期的pre-clean 和clean 以及default生命周期的validate到install所有阶段
     * mvn clean deploy site-deploy: clean生命周期的pre-clean 和clean ，default生命周期的所有阶段，以及site生命周期的所有阶段。
     */
    public void build()
    {
        initialize();
        compile();
        test();
        packagee();
        integrationTest();
        deploy();
    }

    protected abstract void initialize();

    protected abstract void compile();

    protected abstract void test();

    protected abstract void packagee();

    protected abstract void integrationTest();

    protected abstract void deploy();
}
