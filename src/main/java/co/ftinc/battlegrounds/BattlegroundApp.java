package co.ftinc.battlegrounds;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.inject.Inject;

/**
 * Created by drew.heavner on 1/27/15.
 */
public class BattlegroundApp extends Application<BattlegroundConfiguration>{
    public static void main(String[] args) throws Exception{
        new BattlegroundApp().run(args);
    }


    @Override
    public void initialize(Bootstrap<BattlegroundConfiguration> bootstrap) {

    }

    @Override
    public void run(BattlegroundConfiguration configuration, Environment environment) throws Exception {

    }
}
