package com.example.duclh.mvvm_demo.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.duclh.mvvm_demo.model.Article;
import com.example.duclh.mvvm_demo.view.ArticleAdapter;

import java.util.List;

/**
 * Created by duclh on 31/07/2017.
 */

public class MainViewModel extends BaseObservable {
    public Context context;
    public List<Article> articles;
    private ArticleAdapter mArticleAdapter;

    @Bindable
    public ArticleAdapter getArticleAdapter() {
        return mArticleAdapter;
    }

    public void setArticleAdapter(ArticleAdapter articleAdapter) {
        mArticleAdapter = articleAdapter;
    }

    public MainViewModel(Context context, List<Article> articles, ArticleAdapter adapter) {
        addData(context, articles, adapter);
        this.context = context;
        this.articles = articles;
        this.mArticleAdapter = adapter;
    }

    void addData(Context context, List<Article> articles, ArticleAdapter adapter ) {
        articles.add(new Article("An outbreak of parasitic bees",
                "This summer, we are facing a very serious issue. And it is nothing else but an outbreak of parasitic bees.",
                true, "android.resource://com.example.duclh.mvvm_demo/drawable/bee","Varroa destructor and Varroa jacobsoni are parasitic mites that feed on the bodily fluids of adult, pupal and larval bees. Varroa mites can be seen with the naked eye as a small red or brown spot on the bee's thorax. Varroa mites are carriers for many viruses that are damaging to bees. For example, bees infected during their development will often have visibly deformed wings.\n" +
                "\n" +
                "Varroa mites have led to the virtual elimination of feral bee colonies in many areas, and are a major problem for kept bees in apiaries. Some feral populations are now recovering—it appears they have been naturally selected for Varroa resistance.\n" +
                "\n" +
                "Varroa mites were first discovered in Southeast Asia in about 1904, but are now present on all continents except Australia. They were discovered in the United States in 1987, in New Zealand in 2000, and in Devon, United Kingdom in 1992."));
        articles.add(new Article("Brno - the city of 2016",
                "It has been announced by the committee of know-it-all that Brno has been elected city of year 2016.",
                false, "android.resource://com.example.duclh.mvvm_demo/drawable/brno","The etymology of the name Brno is disputed. It perhaps comes from Old Czech brnie 'muddy, swampy.'[20] Alternative derivations are from a Slavic verb brniti (to armour or to fortify) or a Celtic language spoken in the area before it was overrun by Germanic peoples and later Slavic peoples (this theory would make it cognate with other Celtic words for hill, such as the Welsh word bryn).\n" +
                "\n" +
                "Throughout its history, Brno's locals also referred to the town in other languages, including Brünn in German, ברין (Brin) in Yiddish and Bruna in Latin. The city was also referred to as Brunn (English: /brʌn/)[21] in English, but this usage is not common today.[22]\n" +
                "\n" +
                "The Asteroid 2889 Brno was named after the city, as well as the Bren light machine gun (Brno + Enfield), one of the most famous weapons of World War II."));
        articles.add(new Article("Restaurants in trouble",
                "Restaurants offering daily menus could soon face a serious trouble. The government has just...",
                true, "android.resource://com.example.duclh.mvvm_demo/drawable/food","Some in the food industry have been operating at a heightened threat level for many years now. Though people still love fast-food, fast-casual eateries and formal restaurants were hit fairly hard by the evolving state of the market. Many have recovered, but things continue to churn.\n" +
                "\n" +
                "For example, chains like The Olive Garden and Red Lobster are or looked to be nearing the end of their lifespan. They’ve since recovered, though that has a lot to do with external economic conditions."));
        articles.add(new Article("Survey amongst drivers reveals shocking facts",
                "A survey taken by 1100 drivers commuting every day to work shows that the drivers mostly drive their car alone.",
                false, "android.resource://com.example.duclh.mvvm_demo/drawable/driver","In 2016, there were 40,000 vehicle crash fatalities. That is a six percent increase over 2015 and a 14 percent increase over 2014–the most dramatic two-year escalation in 53 years. The estimated price tag for society is $432 billion. It has been nearly a decade since the National Safety Council (NSC) has reported numbers this high.\n" +
                "The increased numbers do not end with fatalities: 4.6 million vehicle occupants were injured seriously enough to require medical attention, a seven percent increase over 2015. The NSC has been compiling and releasing annual traffic fatalities since 1921."));
        articles.add(new Article("Rugby for everyone?",
                "Until lately, rugby has been considered a sport played only by men. What are the consequences...",
                false, "android.resource://com.example.duclh.mvvm_demo/drawable/rugby","Following the 1895 split in rugby football, the two forms rugby league and rugby union differed in administration only. Soon the rules of rugby league were modified, resulting in two distinctly different forms of rugby. After 100 years, in 1995 rugby union joined rugby league and most other forms of football as an openly professional sport."));
    }
}
