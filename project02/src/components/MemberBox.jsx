const MemberBox = ({name, gender, favorite}) => {
  return (
    <div className="member">
        <p>이름 : {name}</p>
        <p>성별 : {gender}</p>
        <p>좋아하는 노래 : {favorite}</p>
    </div>
  )
}

export default MemberBox