package net.deechael.chschar;

public enum Phoneticization {

    A(0, Finals.A),
    O(0, Finals.O),
    E(0, Finals.E),
    I(0, Finals.I),
    U(0, Finals.U),
    V(0, Finals.V),
    R(-1, Finals.UNKNOWN),
    ANG(0, Finals.A),
    M(-1, Finals.UNKNOWN),
    N(-1, Finals.UNKNOWN),
    NG(-1, Finals.UNKNOWN),
    AI(0, Finals.A),
    EI(0, Finals.E),
    UI(1, Finals.I),
    AO(0, Finals.A),
    OU(0, Finals.O),
    IU(1, Finals.U),
    IE(1, Finals.E),
    VE(1, Finals.E),
    ER(0, Finals.E),
    AN(0, Finals.A),
    EN(0, Finals.E),
    ENG(0, Finals.E),
    UN(0, Finals.U),
    VN(0, Finals.V),
    BA(1, Finals.A),
    BO(1, Finals.O),
    BE(1, Finals.E),
    BI(1, Finals.I),
    BU(1, Finals.U),
    BV(1, Finals.V),
    BAI(1, Finals.A),
    BEI(1, Finals.E),
    BUI(2, Finals.I),
    BAO(1, Finals.A),
    BIAO(2, Finals.A),
    BOU(1, Finals.O),
    BIU(2, Finals.U),
    BIE(2, Finals.E),
    BUE(2, Finals.E),
    BVE(2, Finals.E),
    BER(1, Finals.E),
    BAN(1, Finals.A),
    BEN(1, Finals.E),
    BIN(1, Finals.I),
    BUN(1, Finals.U),
    BVN(1, Finals.V),
    BANG(1, Finals.A),
    BING(1, Finals.I),
    BENG(1, Finals.E),
    BUNG(1, Finals.U),
    BONG(1, Finals.O),
    BIAN(2, Finals.A),
    BUA(2, Finals.A),
    CA(1, Finals.A),
    CO(1, Finals.O),
    CE(1, Finals.E),
    CI(1, Finals.I),
    CU(1, Finals.U),
    CV(1, Finals.V),
    CAI(1, Finals.A),
    CEI(1, Finals.E),
    CUI(2, Finals.I),
    CAO(1, Finals.A),
    COU(1, Finals.O),
    CIU(2, Finals.U),
    CIE(2, Finals.E),
    CUE(2, Finals.E),
    CVE(2, Finals.E),
    CER(1, Finals.E),
    CAN(1, Finals.A),
    CEN(1, Finals.E),
    CIN(1, Finals.I),
    CUN(1, Finals.U),
    CVN(1, Finals.V),
    CANG(1, Finals.A),
    CING(1, Finals.I),
    CENG(1, Finals.E),
    CUNG(1, Finals.U),
    CIAN(2, Finals.A),
    CUA(2, Finals.A),
    CUO(2, Finals.O),
    CUAN(2, Finals.A),
    CUANG(2, Finals.A),
    CONG(1, Finals.O),
    PA(1, Finals.A),
    PO(1, Finals.O),
    PE(1, Finals.E),
    PI(1, Finals.I),
    PU(1, Finals.U),
    PV(1, Finals.V),
    PAI(1, Finals.A),
    PEI(1, Finals.E),
    PUI(2, Finals.I),
    PAO(1, Finals.A),
    POU(1, Finals.O),
    PIU(2, Finals.U),
    PIE(2, Finals.E),
    PUE(2, Finals.E),
    PVE(2, Finals.E),
    PER(1, Finals.E),
    PAN(1, Finals.A),
    PEN(1, Finals.E),
    PIN(1, Finals.I),
    PUN(1, Finals.U),
    PVN(1, Finals.V),
    PANG(1, Finals.A),
    PING(1, Finals.I),
    PENG(1, Finals.E),
    PUNG(1, Finals.U),
    PONG(1, Finals.O),
    PIAN(2, Finals.A),
    PIAO(2, Finals.A),
    PUA(2, Finals.A),
    MA(1, Finals.A),
    MO(1, Finals.O),
    ME(1, Finals.E),
    MI(1, Finals.I),
    MU(1, Finals.U),
    MV(1, Finals.V),
    MAI(1, Finals.A),
    MEI(1, Finals.E),
    MUI(2, Finals.I),
    MAO(1, Finals.A),
    MIAO(2, Finals.A),
    MOU(1, Finals.O),
    MIU(2, Finals.U),
    MIE(2, Finals.E),
    MUE(2, Finals.E),
    MVE(2, Finals.E),
    MER(1, Finals.E),
    MAN(1, Finals.A),
    MEN(1, Finals.E),
    MIN(1, Finals.I),
    MUN(1, Finals.U),
    MVN(1, Finals.V),
    MANG(1, Finals.A),
    MING(1, Finals.I),
    MENG(1, Finals.E),
    MONG(1, Finals.O),
    MUNG(1, Finals.U),
    MIAN(2, Finals.A),
    MUA(2, Finals.A),
    FA(1, Finals.A),
    FO(1, Finals.O),
    FE(1, Finals.E),
    FI(1, Finals.I),
    FU(1, Finals.U),
    FV(1, Finals.V),
    FAI(1, Finals.A),
    FEI(1, Finals.E),
    FUI(2, Finals.I),
    FAO(1, Finals.A),
    FOU(1, Finals.O),
    FIU(2, Finals.U),
    FIE(2, Finals.E),
    FUE(2, Finals.E),
    FVE(2, Finals.E),
    FER(1, Finals.E),
    FAN(1, Finals.A),
    FEN(1, Finals.E),
    FIN(1, Finals.I),
    FUN(1, Finals.U),
    FVN(1, Finals.V),
    FANG(1, Finals.A),
    FING(1, Finals.I),
    FENG(1, Finals.E),
    FONG(1, Finals.O),
    FUNG(1, Finals.U),
    FUA(2, Finals.A),
    DA(1, Finals.A),
    DUO(2, Finals.O),
    DE(1, Finals.E),
    DI(1, Finals.I),
    DU(1, Finals.U),
    DV(1, Finals.V),
    DAI(1, Finals.A),
    DEI(1, Finals.E),
    DUI(2, Finals.I),
    DAO(1, Finals.A),
    DIAO(2, Finals.A),
    DOU(1, Finals.O),
    DIU(2, Finals.U),
    DIE(2, Finals.E),
    DIA(2, Finals.A),
    DUE(2, Finals.E),
    DVE(2, Finals.E),
    DER(1, Finals.E),
    DAN(1, Finals.A),
    DEN(1, Finals.E),
    DIN(1, Finals.I),
    DUN(1, Finals.U),
    DVN(1, Finals.V),
    DANG(1, Finals.A),
    DING(1, Finals.I),
    DENG(1, Finals.E),
    DONG(1, Finals.O),
    DUNG(1, Finals.U),
    DUA(2, Finals.A),
    DUAN(2, Finals.A),
    DUANG(2, Finals.A),
    DIAN(2, Finals.A),
    TA(1, Finals.A),
    TUO(2, Finals.O),
    TE(1, Finals.E),
    TI(1, Finals.I),
    TU(1, Finals.U),
    TV(1, Finals.V),
    TAI(1, Finals.A),
    TEI(1, Finals.E),
    TUI(2, Finals.I),
    TAO(1, Finals.A),
    TIAO(2, Finals.A),
    TOU(1, Finals.O),
    TIU(2, Finals.U),
    TIE(2, Finals.E),
    TUE(2, Finals.E),
    TVE(2, Finals.E),
    TER(1, Finals.E),
    TAN(1, Finals.A),
    TEN(1, Finals.E),
    TIN(1, Finals.I),
    TUN(1, Finals.U),
    TVN(1, Finals.V),
    TANG(1, Finals.A),
    TING(1, Finals.I),
    TONG(1, Finals.O),
    TENG(1, Finals.E),
    TUNG(1, Finals.U),
    TUA(2, Finals.A),
    TUAN(2, Finals.A),
    TUANG(2, Finals.A),
    TIAN(2, Finals.A),
    NA(1, Finals.A),
    NO(1, Finals.O),
    NE(1, Finals.E),
    NI(1, Finals.I),
    NU(1, Finals.U),
    NV(1, Finals.V),
    NAI(1, Finals.A),
    NEI(1, Finals.E),
    NUI(2, Finals.I),
    NAO(1, Finals.A),
    NIAO(2, Finals.A),
    NOU(1, Finals.O),
    NIU(2, Finals.U),
    NIE(2, Finals.E),
    NUE(2, Finals.E),
    NVE(2, Finals.E),
    NER(1, Finals.E),
    NAN(1, Finals.A),
    NEN(1, Finals.E),
    NIN(1, Finals.I),
    NUN(1, Finals.U),
    NUO(2, Finals.O),
    NVN(1, Finals.V),
    NANG(1, Finals.A),
    NIANG(2, Finals.A),
    NING(1, Finals.I),
    NONG(1, Finals.O),
    NENG(1, Finals.E),
    NUNG(1, Finals.U),
    NUA(2, Finals.A),
    NUAN(2, Finals.A),
    NUANG(2, Finals.A),
    NIAN(2, Finals.A),
    NIA(2, Finals.A),
    LA(1, Finals.A),
    LO(1, Finals.O),
    LE(1, Finals.E),
    LI(1, Finals.I),
    LU(1, Finals.U),
    LV(1, Finals.V),
    LAI(1, Finals.A),
    LEI(1, Finals.E),
    LUI(2, Finals.I),
    LAO(1, Finals.A),
    LIAO(2, Finals.A),
    LOU(1, Finals.O),
    LIU(2, Finals.U),
    LIE(2, Finals.E),
    LUE(2, Finals.E),
    LUO(2, Finals.O),
    LVE(2, Finals.E),
    LER(1, Finals.E),
    LAN(1, Finals.A),
    LEN(1, Finals.E),
    LIN(1, Finals.I),
    LIA(2, Finals.A),
    LUN(1, Finals.U),
    LVN(1, Finals.V),
    LANG(1, Finals.A),
    LING(1, Finals.I),
    LENG(1, Finals.E),
    LONG(1, Finals.O),
    LUNG(1, Finals.U),
    LUA(2, Finals.A),
    LUAN(2, Finals.A),
    LIANG(2, Finals.A),
    LIAN(2, Finals.A),
    GA(1, Finals.A),
    GO(1, Finals.O),
    GE(1, Finals.E),
    GI(1, Finals.I),
    GU(1, Finals.U),
    GV(1, Finals.V),
    GAI(1, Finals.A),
    GUAI(2, Finals.A),
    GEI(1, Finals.E),
    GUI(2, Finals.I),
    GAO(1, Finals.A),
    GOU(1, Finals.O),
    GIU(2, Finals.U),
    GIE(2, Finals.E),
    GUE(2, Finals.E),
    GVE(2, Finals.E),
    GER(1, Finals.E),
    GAN(1, Finals.A),
    GEN(1, Finals.E),
    GIN(1, Finals.I),
    GUN(1, Finals.U),
    GUO(2, Finals.O),
    GVN(1, Finals.V),
    GANG(1, Finals.A),
    GING(1, Finals.I),
    GENG(1, Finals.E),
    GUNG(1, Finals.U),
    GONG(1, Finals.O),
    GUA(2, Finals.A),
    GUAN(2, Finals.A),
    GUANG(2, Finals.A),
    KA(1, Finals.A),
    KO(1, Finals.O),
    KE(1, Finals.E),
    KI(1, Finals.I),
    KU(1, Finals.U),
    KV(1, Finals.V),
    KAI(1, Finals.A),
    KUAI(2, Finals.A),
    KEI(1, Finals.E),
    KUI(2, Finals.I),
    KAO(1, Finals.A),
    KOU(1, Finals.O),
    KIU(2, Finals.U),
    KIE(2, Finals.E),
    KUE(2, Finals.E),
    KUO(2, Finals.O),
    KVE(2, Finals.E),
    KER(1, Finals.E),
    KAN(1, Finals.A),
    KEN(1, Finals.E),
    KIN(1, Finals.I),
    KUN(1, Finals.U),
    KVN(1, Finals.V),
    KANG(1, Finals.A),
    KING(1, Finals.I),
    KENG(1, Finals.E),
    KONG(1, Finals.O),
    KUNG(1, Finals.U),
    KUA(2, Finals.A),
    KUAN(2, Finals.A),
    KUANG(2, Finals.A),
    HA(1, Finals.A),
    HO(1, Finals.O),
    HUO(2, Finals.O),
    HE(1, Finals.E),
    HI(1, Finals.I),
    HU(1, Finals.U),
    HV(1, Finals.V),
    HAI(1, Finals.A),
    HUAI(2, Finals.A),
    HEI(1, Finals.E),
    HUI(2, Finals.I),
    HAO(1, Finals.A),
    HOU(1, Finals.O),
    HIU(2, Finals.U),
    HIE(2, Finals.E),
    HUE(2, Finals.E),
    HVE(2, Finals.E),
    HER(1, Finals.E),
    HAN(1, Finals.A),
    HEN(1, Finals.E),
    HIN(1, Finals.I),
    HUN(1, Finals.U),
    HVN(1, Finals.V),
    HANG(1, Finals.A),
    HING(1, Finals.I),
    HENG(1, Finals.E),
    HONG(1, Finals.O),
    HUNG(1, Finals.U),
    HUA(2, Finals.A),
    HUAN(2, Finals.A),
    HUANG(2, Finals.A),
    JA(1, Finals.A),
    JO(1, Finals.O),
    JE(1, Finals.E),
    JI(1, Finals.I),
    JU(1, Finals.U),
    JV(1, Finals.V),
    JAI(1, Finals.A),
    JEI(1, Finals.E),
    JUI(2, Finals.I),
    JIAO(2, Finals.A),
    JOU(1, Finals.O),
    JIU(2, Finals.U),
    JIE(2, Finals.E),
    JUE(2, Finals.E),
    JVE(2, Finals.E),
    JER(1, Finals.E),
    JAN(1, Finals.A),
    JEN(1, Finals.E),
    JIN(1, Finals.I),
    JUN(1, Finals.U),
    JVN(1, Finals.V),
    JIANG(2, Finals.A),
    JING(1, Finals.I),
    JENG(1, Finals.E),
    JUNG(1, Finals.U),
    JUA(2, Finals.A),
    JUAN(2, Finals.A),
    JUANG(2, Finals.A),
    JIONG(2, Finals.O),
    JIAN(2, Finals.A),
    JIA(2, Finals.A),
    QA(1, Finals.A),
    QO(1, Finals.O),
    QE(1, Finals.E),
    QI(1, Finals.I),
    QU(1, Finals.U),
    QV(1, Finals.V),
    QAI(1, Finals.A),
    QEI(1, Finals.E),
    QUI(2, Finals.I),
    QIAO(2, Finals.A),
    QOU(1, Finals.O),
    QIU(2, Finals.U),
    QIE(2, Finals.E),
    QUE(2, Finals.E),
    QVE(2, Finals.E),
    QER(1, Finals.E),
    QAN(1, Finals.A),
    QEN(1, Finals.E),
    QIN(1, Finals.I),
    QUN(1, Finals.U),
    QVN(1, Finals.V),
    QIANG(2, Finals.A),
    QING(1, Finals.I),
    QIONG(2, Finals.O),
    QENG(1, Finals.E),
    QUNG(1, Finals.U),
    QUA(2, Finals.A),
    QUAN(2, Finals.A),
    QUANG(2, Finals.A),
    QIAN(2, Finals.A),
    QIA(2, Finals.A),
    XA(1, Finals.A),
    XO(1, Finals.O),
    XE(1, Finals.E),
    XI(1, Finals.I),
    XU(1, Finals.U),
    XV(1, Finals.V),
    XAI(1, Finals.A),
    XEI(1, Finals.E),
    XUI(2, Finals.I),
    XIAO(2, Finals.A),
    XOU(1, Finals.O),
    XIU(2, Finals.U),
    XIE(2, Finals.E),
    XUE(2, Finals.E),
    XVE(2, Finals.E),
    XER(1, Finals.E),
    XAN(1, Finals.A),
    XEN(1, Finals.E),
    XIN(1, Finals.I),
    XUN(1, Finals.U),
    XVN(1, Finals.V),
    XIANG(2, Finals.A),
    XING(1, Finals.I),
    XENG(1, Finals.E),
    XUNG(1, Finals.U),
    XUA(2, Finals.A),
    XUAN(2, Finals.A),
    XUANG(2, Finals.A),
    XIONG(2, Finals.O),
    XIAN(2, Finals.A),
    XIA(2, Finals.A),
    RA(1, Finals.A),
    RO(1, Finals.O),
    RE(1, Finals.E),
    RI(1, Finals.I),
    RU(1, Finals.U),
    RV(1, Finals.V),
    RAI(1, Finals.A),
    REI(1, Finals.E),
    RUI(2, Finals.I),
    RUO(2, Finals.O),
    RAO(1, Finals.A),
    ROU(1, Finals.O),
    RIU(2, Finals.U),
    RIE(2, Finals.E),
    RUE(2, Finals.E),
    RVE(2, Finals.E),
    RER(1, Finals.E),
    RAN(1, Finals.A),
    REN(1, Finals.E),
    RIN(1, Finals.I),
    RUN(1, Finals.U),
    RVN(1, Finals.V),
    RANG(1, Finals.A),
    RING(1, Finals.I),
    RENG(1, Finals.E),
    RONG(1, Finals.O),
    RUNG(1, Finals.U),
    RUA(2, Finals.A),
    RUAN(2, Finals.A),
    RUANG(2, Finals.A),
    ZA(1, Finals.A),
    ZUO(2, Finals.O),
    ZE(1, Finals.E),
    ZI(1, Finals.I),
    ZU(1, Finals.U),
    ZV(1, Finals.V),
    ZAI(1, Finals.A),
    ZEI(1, Finals.E),
    ZUI(2, Finals.I),
    ZAO(1, Finals.A),
    ZOU(1, Finals.O),
    ZIU(2, Finals.U),
    ZIE(2, Finals.E),
    ZUE(2, Finals.E),
    ZVE(2, Finals.E),
    ZER(1, Finals.E),
    ZAN(1, Finals.A),
    ZEN(1, Finals.E),
    ZIN(1, Finals.I),
    ZUN(1, Finals.U),
    ZVN(1, Finals.V),
    ZANG(1, Finals.A),
    ZING(1, Finals.I),
    ZENG(1, Finals.E),
    ZONG(1, Finals.O),
    ZUNG(1, Finals.U),
    ZUA(2, Finals.A),
    ZUAN(2, Finals.A),
    ZUANG(2, Finals.A),
    SA(1, Finals.A),
    SO(1, Finals.O),
    SE(1, Finals.E),
    SI(1, Finals.I),
    SU(1, Finals.U),
    SUO(2, Finals.O),
    SV(1, Finals.V),
    SAI(1, Finals.A),
    SEI(1, Finals.E),
    SUI(2, Finals.I),
    SAO(1, Finals.A),
    SOU(1, Finals.O),
    SIU(2, Finals.U),
    SIE(2, Finals.E),
    SUE(2, Finals.E),
    SVE(2, Finals.E),
    SER(1, Finals.E),
    SAN(1, Finals.A),
    SEN(1, Finals.E),
    SIN(1, Finals.I),
    SUN(1, Finals.U),
    SVN(1, Finals.V),
    SANG(1, Finals.A),
    SING(1, Finals.I),
    SENG(1, Finals.E),
    SUNG(1, Finals.U),
    SONG(1, Finals.O),
    SUA(2, Finals.A),
    SUAN(2, Finals.A),
    SUANG(2, Finals.A),
    YA(1, Finals.A),
    YO(1, Finals.O),
    YE(1, Finals.E),
    YI(1, Finals.I),
    YU(1, Finals.U),
    YV(1, Finals.V),
    YAI(1, Finals.A),
    YEI(1, Finals.E),
    YUI(2, Finals.I),
    YAO(1, Finals.A),
    YIAO(2, Finals.A),
    YOU(1, Finals.O),
    YIU(2, Finals.U),
    YIE(2, Finals.E),
    YUE(2, Finals.E),
    YVE(2, Finals.E),
    YER(1, Finals.E),
    YAN(1, Finals.A),
    YEN(1, Finals.E),
    YIN(1, Finals.I),
    YUN(1, Finals.U),
    YVN(1, Finals.V),
    YANG(1, Finals.A),
    YING(1, Finals.I),
    YENG(1, Finals.E),
    YUNG(1, Finals.U),
    YONG(1, Finals.O),
    YUA(2, Finals.A),
    YUAN(2, Finals.A),
    YUANG(2, Finals.A),
    WA(1, Finals.A),
    WO(1, Finals.O),
    WE(1, Finals.E),
    WI(1, Finals.I),
    WU(1, Finals.U),
    WV(1, Finals.V),
    WAI(1, Finals.A),
    WEI(1, Finals.E),
    WUI(2, Finals.I),
    WAO(1, Finals.A),
    WOU(1, Finals.O),
    WIU(2, Finals.U),
    WIE(2, Finals.E),
    WUE(2, Finals.E),
    WVE(2, Finals.E),
    WER(1, Finals.E),
    WAN(1, Finals.A),
    WEN(1, Finals.E),
    WIN(1, Finals.I),
    WUN(1, Finals.U),
    WVN(1, Finals.V),
    WANG(1, Finals.A),
    WING(1, Finals.I),
    WENG(1, Finals.E),
    WUNG(1, Finals.U),
    WUA(2, Finals.A),
    ZHA(1, Finals.A),
    ZHUO(2, Finals.O),
    ZHE(1, Finals.E),
    ZHI(1, Finals.I),
    ZHU(1, Finals.U),
    ZHV(1, Finals.V),
    ZHAI(2, Finals.A),
    ZHEI(2, Finals.E),
    ZHUI(3, Finals.I),
    ZHAO(2, Finals.A),
    ZHOU(2, Finals.O),
    ZHIU(3, Finals.U),
    ZHIE(3, Finals.E),
    ZHUE(3, Finals.E),
    ZHVE(3, Finals.E),
    ZHER(2, Finals.E),
    ZHAN(2, Finals.A),
    ZHUAI(3, Finals.A),
    ZHEN(2, Finals.E),
    ZHIN(2, Finals.I),
    ZHUN(2, Finals.U),
    ZHVN(2, Finals.V),
    ZHANG(2, Finals.A),
    ZHING(2, Finals.I),
    ZHENG(2, Finals.E),
    ZHONG(2, Finals.O),
    ZHUNG(2, Finals.U),
    ZHUA(3, Finals.A),
    ZHUAN(3, Finals.A),
    ZHUANG(3, Finals.A),
    CHA(2, Finals.A),
    CHUO(3, Finals.O),
    CHE(2, Finals.E),
    CHI(2, Finals.I),
    CHU(2, Finals.U),
    CHV(2, Finals.V),
    CHAI(2, Finals.A),
    CHEI(2, Finals.E),
    CHUI(3, Finals.I),
    CHAO(2, Finals.A),
    CHOU(2, Finals.O),
    CHIU(3, Finals.U),
    CHIE(3, Finals.E),
    CHUE(3, Finals.E),
    CHVE(3, Finals.E),
    CHER(2, Finals.E),
    CHAN(2, Finals.A),
    CHEN(2, Finals.E),
    CHIN(2, Finals.I),
    CHUN(2, Finals.U),
    CHUAI(3, Finals.A),
    CHVN(2, Finals.V),
    CHANG(2, Finals.A),
    CHING(2, Finals.I),
    CHENG(2, Finals.E),
    CHONG(2, Finals.O),
    CHUNG(2, Finals.U),
    CHUA(3, Finals.A),
    CHUAN(3, Finals.A),
    CHUANG(3, Finals.A),
    SHA(2, Finals.A),
    SHUO(3, Finals.O),
    SHE(2, Finals.E),
    SHI(2, Finals.I),
    SHU(2, Finals.U),
    SHV(2, Finals.V),
    SHAI(2, Finals.A),
    SHEI(2, Finals.E),
    SHUI(3, Finals.I),
    SHAO(2, Finals.A),
    SHOU(2, Finals.O),
    SHIU(3, Finals.U),
    SHIE(3, Finals.E),
    SHUE(3, Finals.E),
    SHVE(3, Finals.E),
    SHER(2, Finals.E),
    SHAN(2, Finals.A),
    SHEN(2, Finals.E),
    SHIN(2, Finals.I),
    SHUN(2, Finals.U),
    SHUAI(3, Finals.A),
    SHVN(2, Finals.V),
    SHANG(2, Finals.A),
    SHONG(2, Finals.O),
    SHING(2, Finals.I),
    SHENG(2, Finals.E),
    SHUNG(2, Finals.U),
    SHUA(3, Finals.A),
    SHUAN(3, Finals.A),
    SHUANG(3, Finals.A),
    HNG(-1, Finals.UNKNOWN);

    private final String name;
    private final int finalsPosition;
    private final Finals finals;

    Phoneticization(int position, Finals finals) {
        this.name = this.name().toLowerCase().replace("v", "ü");
        this.finalsPosition = position;
        this.finals = finals;
    }

    public String getName(Tone tone) {
        return StringUtils.replace(this.getName(), this.finals.getCharacter(tone), this.finalsPosition);
    }

    public String getName() {
        return name;
    }

    public String getNameWithV() {
        return this.getName().replace("ü", "v");
    }

    public String getNameWithV(Tone tone) {
        return this.getName(tone).replace("ü", "v");
    }


    @Override
    public String toString() {
        return this.name;
    }
    
}
