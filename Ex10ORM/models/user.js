const Sequelize = require('sequelize')

module.exports = class User extends Sequelize.Model {
    // init : 테이블 컬럼, 자료형 ... -> 테이블 자체 설정
    // associate : 테이블과 테이블의 관계 설정
    static init(sequelize) {
        return super.init({
            // 컬럼 정보(id, pw, age)
            id : {
                type : Sequelize.STRING(50), // 자료형, 크기
                allowNull : false, // NULL 값 허용 여부
                primaryKey : true, // 기본키 지정
                unique : true // UINQUE 설정
            },
            pw : {
                type : Sequelize.STRING(50)
            },
            age : {
                type : Sequelize.INTEGER.UNSIGNED
            }
        }, { // 테이블에 대한 설정
            sequelize, // models/index -> user 연결
            timestamps : false, // true -> createAt, updateAt 컬럼 자동생성
            modelName : 'User', // 프로젝트(node)에서 사용하는 모델 이름
            tableName : 'users', // 실제 db 테이블 이름
            charset : 'utf8',
            collate : 'utf8_general_ci'
        })
    }
    static associate(db) {
        // db.User.hasMany(db.Board, {foreignkey : 'id', sourcekey : 'id'}) 1:N
        // db.User.hasOne ... 1:1
        // db.User.belongToMany ... N:M
    }
}