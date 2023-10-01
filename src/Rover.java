class Rover {
    int x, y;
    char direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void setMouvement(String parcours) {
        char[] tabParcours = parcours.toCharArray();
        for (char elem : tabParcours) {
            if (elem == 'L') {
                tournerGauche();
            } else if (elem == 'R') {
                tournerDroit();

            } else if (elem == 'M') {
                allerDirect();
            }
        }

    }

    private void tournerGauche() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;

        }


    }

    private void tournerDroit() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;

        }
    }

    private void allerDirect() {
        x++;

    }
}
