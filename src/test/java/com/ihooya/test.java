package com.ihooya;

import ly.test.com.mapper.BusDataMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class test {

    @Test
    public void requestLine(){
        RestTemplate restTemplate = new RestTemplate();
        String lines = "1路,10路,11路,12路,13路,14路,15路,16路,17路,18路,19路,100路,100路区间,100路高峰,107路,108路,109路,110路,111路,112路,113路,114路,115路,115路地铁专线,116路,117路,118路,118路高峰巴士,120路,121路,122路,123路,125路,126路,127路,128路,129路,130路,130路区间,131路,133路,134路,135路,136路,138路,139路,140路,140路高峰,141路,142路,143路,145路,146路,147路,149路,153路,158路,159路,160路,161路,162路,163路,164路,165路,166路,169路,170路,171路,176路,178路,179路,179路高峰大站车,180路,181路,182路,184路,186路,190路,194路,195路,196路,197路,198路,199路,2路,20路,21路,22路,23路,24路,25路,26路,27路,28路,29路,29路高峰巴士,200路,201路,202路,203路,204路,205路,206路,207路,208路,209路,3路,30路,31路,32路,33路,34路,34路区间,35路,36路,37路,39路,301路,302路,303路,304路,305路,306路,307路,308路,309路,310路,311路,313路,314路,315路,316路,317路,318路,319路,320路,321路,322路,323路,324路,325路,326路,327路,328路,329路,330路,331路,332路,333路,334路,335路,336路,337路,338路,339路,340路,4路,40路,41路,42路,43路,44路,45路,46路,47路,48路,49路,400路,401路,402路,403路,404路,405路,406路,407路,408路,409路,410路,411路,412路,413路,414路,415路,416路,417路,418路,419路,420路,421路,422路,423路,424路,425路,426路,427路,428路,429路,430路,431路,440路,441路,442路,443路,444路,445路,446路,447路,448路,449路,450路,451路,452路,453路,454路,455路,456路,457路,458路,459路,460路,461路,462路,463路,464路,465路,466路,467路,468路,469路,470路,471路,472路,473路,474路,481路,482路,483路,484路,485路环线,486路,487路,488路,5路,5路高峰巴士,50路,50路区间环线,51路,52路,53路,54路,54路区间,55路,55路高峰,56路,57路,58路,59路,501路,502路,503路区间,510路,512路,513路,515路,520路,520路城区专线,521路,521路区间,522路,523路,524路,526路,531路区间,551路,552路,555路,557路,567路,569路,576路,576路区间,583路,6路,60路,61路,62路,63路,64路,65路,66路,67路,68路,69路,600路,601路,602路,603路,604路,605路,606路,607路,608路,610路,611路,612路,614路,615路,616路,617路,618路,619路,621路,622路,623路,624路,625路,626路,627路,628路,629路,630路,631路,631路区间,632路,634路,635路,636路,637路,638路,639路,640路,642路,643路,644路,645路,646路,647路,648路,649路,650路内环环线,650路外环环线,651路,652路,653路,654路,656路,657路,658路,660路,663路,664路,665路,666路,667路,668路,669路,670路,671路,672路,673路,674路,676路,678路,680路,681路,683路,684路,685路,686路,690路,691路,692路,693路,694路,695路,7路,70路,71路,72路,73路,74路,75路,75路高峰,76路,76路高峰,77路,77路高峰,78路,79路,701路,702路,703路,704路,706路,707路,710路,710路区间,711路,712路,716路,718路,719路,737路,743路,754路,755路,764路,768路,769路,780路,791路,792路,8路,8路高峰,80路,81路,82路,83路,84路,85路,86路,87路,88路,88路高峰巴士,89路,801路,802路,803路,805路,806路,807路,808路,808路区间,811路,812路,813路,815路,816路,817路,818路,819路,819路区间,820路,821路,822路,823路,826路,827路,828路,829路,830路,831路,832路,833路,835路,836路,837路,838路,839路,840路,841路,842路,843路,845路环二,845路环一环线,846路,848路,851路,852路,853路,854路,861路,862路,863路,864路,865路,866路,867路,868路,869路,870路,871路环二,871路环一,872路环一,873路环二,873路环一,874路,875路,877路,878路,9路,90路,90路区间,91路,92路,93路,94路,94路高峰巴士,95路,96路,97路,98路,99路,901路,902路,903路,904路,905路,906路,907路,908路,909路,910路,911路,912路,915路,916路,917路,918路,919路,920路,921路,922路,923路,926路,927路,930路,939路,951路,952路,953路,955路,956路,957路,958路,959路,960路,961路,962路,963路,964路,965路,966路,967路,968路,969路,970路,971路,972路,973路,975路,976路,977路,978路,979路,980路,981路,982路,983路,984路,985路,986路,987路,988路,989路,990路,安凤线,安禄线,板桥社区巴士,B1路,B2路接驳线环线,D1路,地铁1号线,地铁S1号线,D2路,地铁2号线,D3路,地铁3号线,D4路,地铁4号线,D5路,D6路,D7路,D8路,地铁S8号线,D9路,D10路,地铁10号线,D11路,D12路,D13路,D14路,D15路,D16路,D17路,D18路,D20路,D61路,G1路,高淳游1路,G2路,高淳游2路,G3路,G4路,G5路,G6路,G7路,G8路,G9路,G59路,G60路,G61路,G62路,G63路,G64路,G65路,G70路,高淳101路,高淳102路,高淳103路,高淳105路,高淳106路,高淳107路,高淳108路,高淳109路,高淳801路城区线,高淳801路开发区线,河西社区巴士,机场巴士江北线,机场二线,贾西社巴,句宝线,机场巴士1号线,机场巴士2号线,机场巴士3号线,K1路,K2路,溧明线,溧水-共和线,溧水-杭村沙塘庵线,溧水-和凤线,溧水-晶桥线,溧水-石湫线,溧天线,溧水1路,溧水游1路,旅游专线1号线,溧水2路,旅游专线2号线,溧水游2路,L3路,溧水3路,溧水5路,溧水6路,溧水7路,溧水8路,溧水9路,溧水11路,溧水12路,溧水13路,溧水15路,溧水16路,溧水17路,溧水101路,溧水102路,溧水103路,溧水105路,溧水106路,溧水201路,溧水-杭村246省道线,棉花堤-江心洲,美丽江宁1号线,美丽江宁2号线,美丽江宁3号线,马鞍山125路,马鞍山133路,南湾营免费接驳线,宁句线,宁溧公交,宁浦线,宁镇线,桥西线,润泰市场班车,水一方专线,天长16路,无线谷路,西乌线,燕子矶-八卦洲,有恒-江心洲,Y1路美丽江宁1号线,有轨电车1号线,Y2路,Y3路,Y4路,Y5路,Y6路,Y7路,Y8路,Y9路,Y10路,Y11路,Y12路,Y13路,Y14路,Y15路,Y16路,Y17路,Y18路,Y19路,Y20路,Y21路,Y22路,Y23路,Y24路,Y25路,Y26路,Y27路,Y28路,Y30路,Y31路,Y32路,Y33路,Y34路,Y35路,仪征36路,Y36路,Y37路,Y39路夜间路,Y40路,中山陵小火车1号线,专1路,中山陵小火车2号线,专2路";
        String[] lineArray = lines.split(",");
        for (String url : lineArray) {
            url="http://127.0.0.1:8083/busData/hello?line="+url;
            String res = restTemplate.getForObject(url,String.class);
         //   System.out.println(res);
        }

    }
    @Test
    public void test()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url="http://127.0.0.1:8083/busData/hello?line=Y33%E8%B7%AF";
        System.out.println(restTemplate.getForObject(url, String.class));
    }

}
