[ -e C:/Users/e160813x/monticoreProjects/FSM/FSM.mc4 ] || (touch $1; echo C:/Users/e160813x/monticoreProjects/FSM/FSM.mc4 removed!; exit 0;)
md5sum -c <<<"5ec26b6fca1f61a1f344d0771a3b02cb *C:/Users/e160813x/monticoreProjects/FSM/FSM.mc4" || (touch $1; echo C:/Users/e160813x/monticoreProjects/FSM/FSM.mc4 changed!; exit 0;)
