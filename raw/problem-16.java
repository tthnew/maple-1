Link: https://nguyenhuyenag.wordpress.com/2020/07/31/problem-16/

f := a*b/(a^2+b^2+3*c^2) + b*c/(3*a^2+b^2+c^2) + c*a/(a^2+3*b^2+c^2);

F := (1/4068038700)*(396495*a^2*b-211575*a^2*c-290610*a*b^2+5740*a*b*c-23330*a*c^2-33615*b^3+49866*b^2*c+69970*b*c^2+37059*c^3)^2+(1/507392847257432400)*(3741799560*a^2*c-1828282815*a*b^2-895379015*a*b*c-3512670770*a*c^2-355899339*b^3+2493149460*b^2*c+538610989*b*c^2-181328070*c^3)^2+(1/99424113315398490245318535600)*(b-c)^2*(1363045160782665*a*b+184963986834010*a*c-795029566322691*b^2-978200137221639*b*c-88180861953498*c^2)^2+(1/826156398345596493958050737393912400)*(b-c)^2*(3544507625968277360*a*c-34131784482139698*b^2-2052752375869663737*b*c-2160836360063106114*c^2)^2+(1/1052676)*(3078*a^3-2565*a^2*b-2565*a^2*c-1008*a*b^2+4060*a*b*c-1000*a*c^2+297*b^3-1626*b^2*c+2268*b*c^2-939*c^3)^2+(18988280356060873203/336728224466986349200)*(b-c)^2*(3*b-2*c)^2*(2*b-3*c)^2;

G := (4941876390717/1097661740461)*(b+c)^2*b^2*c^2+(1/85327754105695780348560)*(1655493190531*a*b-174571866084*a*c+187559396211*b^2+12987530127*b*c-174571866084*c^2)^2*c^2+(1/1817171536839591344774791)*(1097661740461*a*c-566146357925*b^2+531515382536*b*c+1097661740461*c^2)^2*c^2+(1/87292462752)*(834983*a^2*c-205920*a*b^2+624179*a*b*c+830099*a*c^2-205920*b^3-109428*b^2*c+91608*b*c^2-4884*c^3)^2+(1/104544)*(792*a*b-37*a*c-132*b*c-132*c^2)^2*(a+b+c)^2+(1/52272)*(396*a^3+396*a^2*b+396*a^2*c+264*a*b^2-227*a*b*c+132*a*c^2+264*b^3+165*b^2*c+33*b*c^2+132*c^3)^2+(1/32277642931704060)*(195235590*a*b^2+267644317*a*b*c+218530752*a*c^2+195235590*b^3+315530787*b^2*c+338825949*b*c^2+218530752*c^3)^2;

factor(numer(3/5 - f) - F);

factor(numer(f + 1/2) - G);
