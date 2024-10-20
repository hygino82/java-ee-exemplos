sudo docker run --rm -it --shm-size=1024m -p 6901:6901 -e VNC_PW=password -v /home/hygino/container-data:/home/kasm-user/container -v /home/hygino/.ssh:/home/kasm-user/.ssh --entrypoint /bin/bash alerario/devee9:2.1 -c "git config --global user.name 'Adroaldo' && git config --global user.email 'hygino@msn.com' && /dockerstartup/vnc_startup.sh"

git@github.com:hygino82/java-ee-exemplos.git
https://github.com/hygino82/java-ee-exemplos.git


parse_git_branch() {
  git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/ (\1)/'
}

export PS1="\[\033[01;32m\]\u@\h\[\033[00m\]:\[\033[01;34m\]\w\[\033[93m\]\$(parse_git_branch)\[\033[00m\]$ "
